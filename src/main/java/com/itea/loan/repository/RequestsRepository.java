package com.itea.loan.repository;

import com.itea.loan.entities.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepository extends JpaRepository<Requests, Long> {
    Requests findByStatus(String status);
}