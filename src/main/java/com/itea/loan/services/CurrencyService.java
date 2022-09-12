package com.itea.loan.services;

import com.itea.loan.entities.Currency;

public interface CurrencyService {
    Currency CurrencyDetailInfo(Long id);
    Currency SaveCurrency(Currency currency);
}
