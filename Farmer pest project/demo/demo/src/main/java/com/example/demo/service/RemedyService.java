package com.example.demo.service;

import com.example.demo.dto.RemedyResponse;
import com.example.demo.dto.ReportRequest;
import com.example.demo.entity.OrganicRemedy;
import com.example.demo.entity.PestReport;
import com.example.demo.repository.OrganicRemedyRepository;
import com.example.demo.repository.PestReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Business layer writeup
@Service
public class RemedyService {
    private final OrganicRemedyRepository remedyRepo;
    private final PestReportRepository reportRepo;

    public RemedyService(OrganicRemedyRepository remedyRepo, PestReportRepository reportRepo) {
        this.remedyRepo = remedyRepo;
        this.reportRepo = reportRepo;
    }

    public List<String> getCrops() {return  remedyRepo.findDistinctCrops(); }
    public List<String> getSymptomsByCrop(String crop) {return  remedyRepo.findDistinctSymptomsByCrop(crop); }

    public List<RemedyResponse> getRemedies(String crop, String symptom) {
        List<OrganicRemedy> matches = remedyRepo.findByCropIgnoreCaseAndSymptomIgnoreCase(crop, symptom);
        return matches.stream()
                .map(r -> new RemedyResponse(r.getId(), r.getCrop(), r.getSymptom(), r.getSolution(), r.getDosage()))
                .collect(Collectors.toList());
    }

    public Long saveReport(ReportRequest req) {
        PestReport report = new PestReport(
                req.getCrop(),
                req.getSymptom(),
                req.getChosenSolution(),
                req.getLocation(),
                req.getSeverity()
        );
        return reportRepo.save(report).getId();
    }
}
