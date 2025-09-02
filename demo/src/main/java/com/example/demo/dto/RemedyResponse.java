package com.example.demo.dto;

public class RemedyResponse {
    private Long id;
    private String crop;
    private String symptom;
    private String solution;
    private String dosage;

    public RemedyResponse() {}

    public RemedyResponse(Long id, String crop, String symptom, String solution, String dosage) {
        this.id = id;
        this.crop = crop;
        this.symptom = symptom;
        this.solution = solution;
        this.dosage = dosage;
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

    public String getSolution() {
        return solution;
    }

    public String getDosage() {
        return dosage;
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

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
