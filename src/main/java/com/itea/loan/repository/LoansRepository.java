package com.itea.loan.repository;

import com.itea.loan.entities.Currency;
import com.itea.loan.entities.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepository extends JpaRepository<Loans, Long> {

}