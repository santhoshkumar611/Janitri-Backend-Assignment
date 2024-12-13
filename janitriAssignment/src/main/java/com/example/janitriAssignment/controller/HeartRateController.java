package com.example.janitriAssignment.controller;

import com.example.janitriAssignment.model.HeartRate;
import com.example.janitriAssignment.service.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heart-rates")
public class HeartRateController {
    @Autowired
    private HeartRateService heartRateService;

    @PostMapping
    public ResponseEntity<HeartRate> addHeartRate(@RequestBody HeartRate heartRate) {
        return ResponseEntity.ok(heartRateService.addHeartRate(heartRate));
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<HeartRate>> getHeartRatesByPatient(@PathVariable Long patientId) {
        return ResponseEntity.ok(heartRateService.getHeartRatesByPatientId(patientId));
    }
}
