package com.example.janitriAssignment.service;

import com.example.janitriAssignment.model.HeartRate;
import com.example.janitriAssignment.repository.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HeartRateService {
    @Autowired
    private HeartRateRepository heartRateRepository;

    public HeartRate addHeartRate(HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRatesByPatientId(Long patientId) {
        return heartRateRepository.findAll()
                .stream()
                .filter(hr -> hr.getPatient().getId().equals(patientId))
                .collect(Collectors.toList());
    }
}
