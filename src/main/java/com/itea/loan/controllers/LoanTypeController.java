package com.itea.loan.controllers;

import com.itea.loan.dto.LoanTypeDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class LoanTypeController {
    @PostMapping("loanType")
    private String createLoanType (@Valid @RequestBody LoanTypeDto loanTypeDto){
        return "loanType";
    }
}
