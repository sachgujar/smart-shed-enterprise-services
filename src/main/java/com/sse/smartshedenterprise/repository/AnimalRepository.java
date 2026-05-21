package com.sse.smartshedenterprise.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sse.smartshedenterprise.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
