package com.itea.loan.services;

import com.itea.loan.entities.Loans;

public interface LoanService {
    Loans LoanDetailInfo(Long id);
    Loans SaveClient(Loans loan);
}
