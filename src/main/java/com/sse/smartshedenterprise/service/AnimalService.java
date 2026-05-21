package com.sse.smartshedenterprise.service;

import java.util.List;

import com.sse.smartshedenterprise.entity.Animal;

public interface AnimalService {
	 // Save operation
    Animal saveAnimal(Animal animal);

    // Read operation
    List<Animal> fetchAnimalList();
    Animal fetchAnimalById(Long animalId);
    
    // Update operation
    Animal updateAnimal(Animal animal, Long animalId);

    // Delete operation
    void deleteAnimalById(Long animalId);
}
