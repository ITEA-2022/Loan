package com.itea.loan.controllers;

import com.itea.loan.dto.LoansDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class LoansController {
    @PostMapping("loans")
    private String createLoans (@Valid @RequestBody LoansDto loansDto){
        return "loans";
    }
}
