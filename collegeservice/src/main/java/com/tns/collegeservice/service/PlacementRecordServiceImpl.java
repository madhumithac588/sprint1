package com.tns.collegeservice.service;



import com.tns.collegeservice.entity.PlacementRecord;
import com.tns.collegeservice.repository.PlacementRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementRecordServiceImpl implements PlacementRecordService {

    @Autowired
    private PlacementRecordRepository placementRecordRepository;

    @Override
    public PlacementRecord savePlacementRecord(PlacementRecord placementRecord) {
        return placementRecordRepository.save(placementRecord);
    }

    @Override
    public List<PlacementRecord> getAllPlacementRecords() {
        return placementRecordRepository.findAll();
    }

    @Override
    public PlacementRecord getPlacementRecordById(Long id) {
        return placementRecordRepository.findById(id).orElse(null);
    }

    @Override
    public PlacementRecord updatePlacementRecord(PlacementRecord placementRecord) {
        return placementRecordRepository.save(placementRecord);
    }

    @Override
    public void deletePlacementRecord(Long id) {
        placementRecordRepository.deleteById(id);
    }
}

