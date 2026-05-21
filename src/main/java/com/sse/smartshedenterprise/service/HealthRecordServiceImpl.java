package com.sse.smartshedenterprise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.smartshedenterprise.entity.Animal;
import com.sse.smartshedenterprise.entity.HealthRecord;
import com.sse.smartshedenterprise.repository.AnimalRepository;
import com.sse.smartshedenterprise.repository.HealthRecordRepository;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

	@Autowired
    private HealthRecordRepository healthRecordRepository;

	@Override
	public HealthRecord saveHealthRecord(HealthRecord healthRecord) {
		return healthRecordRepository.save(healthRecord);
		
	}

	@Override
	public List<HealthRecord> fetchHealthRecordList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthRecord fetchHealthRecordById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthRecord updateHealthRecord(HealthRecord healthRecord, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHealthRecordById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteHealthRecordByAnimalId(Long animalId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HealthRecord> fetchHealthRecordByAnimalId(Long animalId) {
//		Optional<Health> animalData= healthRecordRepository.findById(animalId);
//		
//		if(animalData.isPresent()) {
//			return animalData.get();
//		}
//		return null;
		
		  return (List<HealthRecord>)
				  healthRecordRepository.findByAnimalId(animalId);
	}

}
