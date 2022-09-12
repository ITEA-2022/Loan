package com.itea.loan.services;

import com.itea.loan.entities.Currency;
import com.itea.loan.repository.ClientRepository;
import com.itea.loan.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService{
    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public Currency CurrencyDetailInfo(Long id) {
        return currencyRepository.getById(id);
    }

    @Override
    public Currency SaveCurrency(Currency currency) {
        //some addition logic
        return currencyRepository.save(currency);
    }
}
