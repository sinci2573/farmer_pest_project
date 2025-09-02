package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class ReportRequest {

    @NotBlank
    private String crop;
    @NotBlank private String symptom;
    @NotBlank private String chosenSolution;
    private String location;
    private String severity;

    public String getCrop() { return crop; }

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
}
