package com.tns.collegeservice.repository;


import  com.tns.collegeservice.entity.PlacementRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementRecordRepository extends JpaRepository<PlacementRecord, Long> {
}
