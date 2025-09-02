package com.example.demo.controller;

import com.example.demo.dto.RemedyResponse;
import com.example.demo.dto.ReportRequest;
import com.example.demo.service.RemedyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST endpoints consumed by the front-end.
 * Base path: /api
 */
@RestController
@RequestMapping("/api")
public class RemedyController {

    private final RemedyService service;

    public RemedyController(RemedyService service) {
        this.service = service;
    }

    /**
     * Get distinct crops for dropdown.
     */
    @GetMapping("/crops")
    public ResponseEntity<List<String>> getCrops() {
        return ResponseEntity.ok(service.getCrops());
    }

    /**
     * Get distinct symptoms for a selected crop.
     * Example: /api/symptoms?crop=Tomato
     */
    @GetMapping("/symptoms")
    public ResponseEntity<List<String>> getSymptoms(@RequestParam String crop) {
        return ResponseEntity.ok(service.getSymptomsByCrop(crop));
    }

    /**
     * Get matching organic remedies for (crop, symptom).
     * Example: /api/remedies?crop=Tomato&symptom=Small%20holes%20on%20leaves
     */
    @GetMapping("/remedies")
    public ResponseEntity<List<RemedyResponse>> getRemedies(
            @RequestParam String crop,
            @RequestParam String symptom
    ) {
        return ResponseEntity.ok(service.getRemedies(crop, symptom));
    }

    /**
     * Save a farmer's usage report to drive analytics in Power BI.
     * Payload: { crop, symptom, chosenSolution, location?, severity? }
     */
    @PostMapping("/reports")
    public ResponseEntity<Long> saveReport(@Valid @RequestBody ReportRequest request) {
        Long id = service.saveReport(request);
        return ResponseEntity.ok(id);
    }
}
