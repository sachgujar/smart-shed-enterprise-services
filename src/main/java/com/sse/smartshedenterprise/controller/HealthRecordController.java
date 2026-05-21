package com.sse.smartshedenterprise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sse.smartshedenterprise.entity.Animal;
import com.sse.smartshedenterprise.entity.HealthRecord;
import com.sse.smartshedenterprise.service.HealthRecordService;

@RestController
@CrossOrigin(origins = "*")
public class HealthRecordController {
	@Autowired 
	private HealthRecordService healthRecordService;
	
	 // Save operation
	@PostMapping("/api/healthrecord")
    public ResponseEntity<HealthRecord> saveHealthRecord( @RequestBody HealthRecord healthRecord)
    {
    	HealthRecord  healthRecordObj =  healthRecordService.saveHealthRecord(healthRecord);        
        return new ResponseEntity<>(healthRecordObj,HttpStatus.OK);
    }
	
	 @GetMapping("/api/animals/{animalId}/health")

	    public ResponseEntity<List<HealthRecord>> fetchAnimalById(@PathVariable Long animalId)
	    {
		 List<HealthRecord> healthRecordObj = healthRecordService.fetchHealthRecordByAnimalId(animalId);
	    	if(healthRecordObj == null) {
	    		 return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    	} else {
	    		 return new ResponseEntity<>(healthRecordObj, HttpStatus.OK);
	    	
	    	}
	       
	        		
	    }
    
}
