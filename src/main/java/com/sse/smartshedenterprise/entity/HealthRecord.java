package com.sse.smartshedenterprise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "AnimalHealthRecords")
//@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class HealthRecord {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private Long   animalId;
	private String   healthEventType;
	private String   date;
	private String   description;
	private String doctor;
	private String dose;
	private String outcome;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(Long animalId) {
		this.animalId = animalId;
	}
	public String getHealthEventType() {
		return healthEventType;
	}
	public void setHealthEventType(String healthEventType) {
		this.healthEventType = healthEventType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	
	
	
}
