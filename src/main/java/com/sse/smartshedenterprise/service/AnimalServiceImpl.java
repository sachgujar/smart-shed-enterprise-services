package com.sse.smartshedenterprise.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.smartshedenterprise.entity.Animal;
import com.sse.smartshedenterprise.repository.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

	
    // Save operation
    @Override
    public Animal saveAnimal(Animal animal)
    {
    	System.out.println("animal===>"+ animal.toString());
        return animalRepository.save(animal);
    }

    // Read operation
    @Override public List<Animal> fetchAnimalList()
    {
        return (List<Animal>)
            animalRepository.findAll();
    }
    
    

    // Update operation
    @Override
    public Animal
    updateAnimal(Animal animal,
                     Long animalId)
    {

    	Animal animalDB
            = animalRepository.findById(animalId)
                  .get();

        if (Objects.nonNull(animal.getName())
            && !"".equalsIgnoreCase(
                animal.getName())) {
        	animalDB.setName(
                animal.getName());
        }
        
        if (Objects.nonNull(animal.getTagNumber())
                && !"".equalsIgnoreCase(
                    animal.getTagNumber())) {
        	animalDB.setTagNumber(
                    animal.getTagNumber());
            }
        if (Objects.nonNull(animal.getGender())
                && !"".equalsIgnoreCase(
                    animal.getGender())) {
        	animalDB.setGender(
                    animal.getGender());
            }
        
        if (Objects.nonNull(animal.getBreed())
        	    && !"".equalsIgnoreCase(
        	        animal.getBreed())) {
        	    animalDB.setBreed(
        	        animal.getBreed());
        	}

        	if (Objects.nonNull(animal.getDob())
        	    && !"".equalsIgnoreCase(
        	        animal.getDob())) {
        	    animalDB.setDob(
        	        animal.getDob());
        	}

        	if (Objects.nonNull(animal.getWeightKg())
        	    && 5 <
        	        animal.getWeightKg()) {
        	    animalDB.setWeightKg(
        	        animal.getWeightKg());
        	}

        	if (Objects.nonNull(animal.getPhotoUrl())
        	    && !"".equalsIgnoreCase(
        	        animal.getPhotoUrl())) {
        	    animalDB.setPhotoUrl(
        	        animal.getPhotoUrl());
        	}

        	if (Objects.nonNull(animal.getStatus())
        	    && !"".equalsIgnoreCase(
        	        animal.getStatus())) {
        	    animalDB.setStatus(
        	        animal.getStatus());
        	}

        	if (Objects.nonNull(animal.getMotherTag())
        	    && !"".equalsIgnoreCase(
        	        animal.getMotherTag())) {
        	    animalDB.setMotherTag(
        	        animal.getMotherTag());
        	}

        	if (Objects.nonNull(animal.getFatherTag())
        	    && !"".equalsIgnoreCase(
        	        animal.getFatherTag())) {
        	    animalDB.setFatherTag(
        	        animal.getFatherTag());
        	}

        	if (Objects.nonNull(animal.getShed())
        	    && !"".equalsIgnoreCase(
        	        animal.getShed())) {
        	    animalDB.setShed(
        	        animal.getShed());
        	}

        	if (Objects.nonNull(animal.getOwner())
        	    && !"".equalsIgnoreCase(
        	        animal.getOwner())) {
        	    animalDB.setOwner(
        	        animal.getOwner());
        	}

        	if (Objects.nonNull(animal.getNotes())
        	    && !"".equalsIgnoreCase(
        	        animal.getNotes())) {
        	    animalDB.setNotes(
        	        animal.getNotes());
        	}
       
        return animalRepository.save(animalDB);
    }

    // Delete operation
    @Override
    public void deleteAnimalById(Long animalId)
    {
        animalRepository.deleteById(animalId);
    }

	@Override
	public Animal fetchAnimalById(Long animalId) {
		Optional<Animal> animalData= animalRepository.findById(animalId);
		
		if(animalData.isPresent()) {
			return animalData.get();
		}
		return null;
	}
}
