package com.example.demo.repository;

import com.example.demo.entity.PestReport;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository to store farmer-submitted reports for analytics
public interface PestReportRepository extends JpaRepository<PestReport, Long> {
}
