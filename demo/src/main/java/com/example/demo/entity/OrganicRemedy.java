package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "organic_remedies")
public class OrganicRemedy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Long id;

    //validation
    @Column(nullable = false) private String crop;
    @Column(nullable = false) private String symptom;
    @Column(nullable = false) private String solution;
    @Column(nullable = false) private String dosage;

    public OrganicRemedy() {}

    public OrganicRemedy(String crop, String symptom, String solution, String dosage){
        this.crop=crop;
        this.symptom=symptom;
        this.solution=solution;
        this.dosage=dosage;
    }

    public Long getId() { return id; }
    public String getCrop() { return crop; }
    public String getSymptom() { return  symptom; }
    public String getSolution() { return  solution; }
    public String getDosage() { return  dosage; }

    public void setId(Long id) { this.id = id; }
    public void setCrop(String crop) {this.crop = crop; }
    public void setSymptom(String symptom) {this.symptom = symptom; }
    public void setSolution(String solution) {this.solution = solution; }
    public void setDosage(String dosage) {this.dosage = dosage; }
}
