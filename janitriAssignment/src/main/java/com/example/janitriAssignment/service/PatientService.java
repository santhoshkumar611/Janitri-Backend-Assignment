package com.example.janitriAssignment.service;

import com.example.janitriAssignment.model.Patient;
import com.example.janitriAssignment.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Optional<Patient> getPatient(Long id) {
        return patientRepository.findById(id);
    }
}
