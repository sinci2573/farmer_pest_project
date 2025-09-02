package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pest_reports")
public class PestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String crop;
    @Column(nullable = false) private String symptom;
    @Column(name = "chosen_solution", nullable = false) private String chosenSolution;

    private String location;

    private String severity;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate(){
        if (createdAt == null){
            createdAt = LocalDateTime.now();
        }
    }

    public PestReport() {}

    public PestReport(String crop, String symptom, String chosenSolution, String location, String severity){
        this.crop = crop;
        this.symptom = symptom;
        this.chosenSolution = chosenSolution;
        this.location = location;
        this.severity=severity;
    }

    public Long getId() {
        return id;
    }

    public String getCrop() {
        return crop;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getChosenSolution() {
        return chosenSolution;
    }

    public String getLocation() {
        return location;
    }
    public String getSeverity() {
        return severity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setChosenSolution(String chosenSolution) {
        this.chosenSolution = chosenSolution;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}