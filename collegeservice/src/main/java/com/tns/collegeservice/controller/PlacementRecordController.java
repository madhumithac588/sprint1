package com.tns.collegeservice.controller;



import  com.tns.collegeservice.entity.PlacementRecord;
import com.tns.collegeservice.service.PlacementRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placement-records")
public class PlacementRecordController {

    @Autowired
    private PlacementRecordService placementRecordService;

    @PostMapping
    public PlacementRecord createPlacementRecord(@RequestBody PlacementRecord placementRecord) {
        return placementRecordService.savePlacementRecord(placementRecord);
    }


    @GetMapping
    public List<PlacementRecord> getAllPlacementRecords() {
        return placementRecordService.getAllPlacementRecords();
    }

    @GetMapping("/{id}")
    public PlacementRecord getPlacementRecordById(@PathVariable Long id) {
        return placementRecordService.getPlacementRecordById(id);
    }

    @PutMapping("/{id}")
    public PlacementRecord updatePlacementRecord(@PathVariable Long id, @RequestBody PlacementRecord placementRecord) {
        placementRecord.setId(id);
        return placementRecordService.updatePlacementRecord(placementRecord);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlacementRecord(@PathVariable Long id) {
        placementRecordService.deletePlacementRecord(id);
        return ResponseEntity.ok().build();
    }
}
