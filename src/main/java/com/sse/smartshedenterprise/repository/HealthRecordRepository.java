package com.sse.smartshedenterprise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sse.smartshedenterprise.entity.HealthRecord;

@Repository
public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

	List<HealthRecord> findByAnimalId(Long animalId);

}
