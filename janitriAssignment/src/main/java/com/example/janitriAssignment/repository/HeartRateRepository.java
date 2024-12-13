package com.example.janitriAssignment.repository;

import com.example.janitriAssignment.model.HeartRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {
}
