package com.itea.loan.services;

import com.itea.loan.entities.Loans;
import com.itea.loan.repository.CurrencyRepository;
import com.itea.loan.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService{
    @Autowired
    private LoansRepository loansRepository;

    @Override
    public Loans LoanDetailInfo(Long id) {
        return loansRepository.getById(id);
    }

    @Override
    public Loans SaveClient(Loans loan) {
        //some addition logic
        loansRepository.save(loan);
        return loan;
    }
}
