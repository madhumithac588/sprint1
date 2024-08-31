package com.tns.collegeservice.service;



import  com.tns.collegeservice.entity.PlacementRecord;
import java.util.List;

public interface PlacementRecordService {
    PlacementRecord savePlacementRecord(PlacementRecord placementRecord);
    List<PlacementRecord> getAllPlacementRecords();
    PlacementRecord getPlacementRecordById(Long id);
    PlacementRecord updatePlacementRecord(PlacementRecord placementRecord);
    void deletePlacementRecord(Long id);
}
