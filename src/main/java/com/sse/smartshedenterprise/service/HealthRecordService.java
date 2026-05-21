package com.sse.smartshedenterprise.service;

import java.util.List;

import com.sse.smartshedenterprise.entity.HealthRecord;

public interface HealthRecordService {
	 // Save operation
	HealthRecord saveHealthRecord(HealthRecord healthRecord);

    // Read operation
    List<HealthRecord> fetchHealthRecordList();
    HealthRecord fetchHealthRecordById(Long id);
    
    // Update operation
    HealthRecord updateHealthRecord(HealthRecord healthRecord, Long id);
    
    // Delete operation
    void deleteHealthRecordById(Long id);

    // Delete operation
    void deleteHealthRecordByAnimalId(Long animalId);
    
 // Read operation
    List<HealthRecord> fetchHealthRecordByAnimalId(Long id);
}
