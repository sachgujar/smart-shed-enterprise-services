package com.sse.smartshedenterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sse.smartshedenterprise.entity.Animal;
import com.sse.smartshedenterprise.service.AnimalService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AnimalController {
	@Autowired 
	private AnimalService animalService;
	
	 // Save operation
    @PostMapping("/api/animalsbulk")
    public ResponseEntity<Animal> saveAnimalInBulk( @RequestBody Animal[] animal)
    {    
    	Animal a1= new Animal();
    	for(Animal a : animal) {
    	     a1 =  animalService.saveAnimal(a);
    	}
        return new ResponseEntity<>(a1,HttpStatus.OK);
    }
    
    
    @PostMapping("/api/animals")
    public ResponseEntity<Animal> saveAnimal( @RequestBody Animal animal)
    {
    	Animal a =  animalService.saveAnimal(animal);        
        return new ResponseEntity<>(a,HttpStatus.OK);
    }
    
    
 // Read operation
    @GetMapping("/api/animals")

    public List<Animal> fetchAnimalList()
    {
        return animalService.fetchAnimalList();
    }
    
 // Read operation
    @GetMapping("/api/animals/{animalId}")

    public ResponseEntity<Animal> fetchAnimalById(@PathVariable Long animalId)
    {
    	Animal animal = animalService.fetchAnimalById(animalId);
    	if(animal == null) {
    		 return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    	} else {
    		 return new ResponseEntity<>(animal, HttpStatus.OK);
    	
    	}
       
        		
    }
    
 // Update operation
    @PutMapping("/api/animals/{id}")

    public Animal
    updateAnimal(@RequestBody Animal animal,
                     @PathVariable("id") Long animalId)
    {
        return animalService.updateAnimal(
            animal, animalId);
    }

    // Delete operation
    @DeleteMapping("/api/animals/{id}")

    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
    	animalService.deleteAnimalById(
            departmentId);
        return "Deleted Successfully";
    }

}
