package com.example.janitriAssignment.repository;

import com.example.janitriAssignment.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
