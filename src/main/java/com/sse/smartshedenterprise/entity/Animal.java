package com.sse.smartshedenterprise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Animals")
//@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Animal {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long animalId;
	
	private String tagNumber;
	private String name;
	private String   gender;
	private String   breed;
	private String   dob;
	private float   weightKg;
	private String photoUrl;
	private String   status;

	// Lineage
	private String motherTag;
	private String fatherTag;

	// Quick-look fields
	private String lastHeatDate;
	private String lastCalvingDate;
	private String lastVaccinationDate;
	private String nextVaccinationDate;
	private String expectedCalvingDate;
	private String lastInseminationDate;
	private float  dailyMilkYieldLiters;


	// location / ownership
	private String shed;
	private String owner;
	private String notes;
	public Long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(Long animalId) {
		this.animalId = animalId;
	}
	public String getTagNumber() {
		return tagNumber;
	}
	public void setTagNumber(String tagNumber) {
		this.tagNumber = tagNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public float getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(float weightKg) {
		this.weightKg = weightKg;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMotherTag() {
		return motherTag;
	}
	public void setMotherTag(String motherTag) {
		this.motherTag = motherTag;
	}
	public String getFatherTag() {
		return fatherTag;
	}
	public void setFatherTag(String fatherTag) {
		this.fatherTag = fatherTag;
	}
	public String getLastHeatDate() {
		return lastHeatDate;
	}
	public void setLastHeatDate(String lastHeatDate) {
		this.lastHeatDate = lastHeatDate;
	}
	public String getLastCalvingDate() {
		return lastCalvingDate;
	}
	public void setLastCalvingDate(String lastCalvingDate) {
		this.lastCalvingDate = lastCalvingDate;
	}
	public String getLastVaccinationDate() {
		return lastVaccinationDate;
	}
	public void setLastVaccinationDate(String lastVaccinationDate) {
		this.lastVaccinationDate = lastVaccinationDate;
	}
	public String getNextVaccinationDate() {
		return nextVaccinationDate;
	}
	public void setNextVaccinationDate(String nextVaccinationDate) {
		this.nextVaccinationDate = nextVaccinationDate;
	}
	public String getExpectedCalvingDate() {
		return expectedCalvingDate;
	}
	public void setExpectedCalvingDate(String expectedCalvingDate) {
		this.expectedCalvingDate = expectedCalvingDate;
	}
	public String getLastInseminationDate() {
		return lastInseminationDate;
	}
	public void setLastInseminationDate(String lastInseminationDate) {
		this.lastInseminationDate = lastInseminationDate;
	}
	public float getDailyMilkYieldLiters() {
		return dailyMilkYieldLiters;
	}
	public void setDailyMilkYieldLiters(float dailyMilkYieldLiters) {
		this.dailyMilkYieldLiters = dailyMilkYieldLiters;
	}
	public String getShed() {
		return shed;
	}
	public void setShed(String shed) {
		this.shed = shed;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	

}
