package com.itea.loan.services;

import com.itea.loan.entities.Loans;
import com.itea.loan.entities.Requests;
import com.itea.loan.repository.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService{
    @Autowired
    private RequestsRepository requestsRepository;

    @Override
    public Requests RequestDetailInfo(Long id) {
        return requestsRepository.getById(id);
    }

    @Override
    public Requests SaveRequest(Requests request) {
        //some addition logic
        requestsRepository.save(request);
        return request;
    }
}
