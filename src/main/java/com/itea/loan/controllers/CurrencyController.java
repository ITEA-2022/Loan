package com.itea.loan.controllers;

import com.itea.loan.dto.CurrencyDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class CurrencyController {
    @PostMapping("createCurrency")
    private String createCurrency(@Valid @RequestBody CurrencyDto currencyDto){
        return "currency";
    }
}
