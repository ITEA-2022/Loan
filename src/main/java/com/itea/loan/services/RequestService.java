package com.itea.loan.services;

import com.itea.loan.entities.Loans;
import com.itea.loan.entities.Requests;

public interface RequestService {
    Requests RequestDetailInfo(Long id);
    Requests SaveRequest(Requests requests);
}
