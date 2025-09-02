package com.example.demo.repository;

import com.example.demo.entity.OrganicRemedy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//JPA repository for querying remedies, allows us to perform CRUD operations on OrganicRemedies
public interface OrganicRemedyRepository extends JpaRepository<OrganicRemedy, Long> {

    //Find matching remedies for a crop + symptom (case-insensitive)
    List<OrganicRemedy> findByCropIgnoreCaseAndSymptomIgnoreCase(String crop, String symptom);

    //Distinct list of crops to populate the dropdown
    @Query("select distinct r.crop from OrganicRemedy r order by r.crop")
    List<String> findDistinctCrops();

    //Distinct symptoms filtered by crop (case-insensitive compare)
    @Query("select distinct r.symptom from OrganicRemedy r "+"where lower(r.crop) = lower(?1) order by r.symptom")
    List<String> findDistinctSymptomsByCrop(String crop);
}
