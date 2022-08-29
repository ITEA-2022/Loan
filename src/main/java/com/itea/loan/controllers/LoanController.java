package com.itea.loan.controllers;

import com.itea.loan.dto.LoanDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class LoanController {
    @PostMapping("createLoan")
    private String createLoan (@Valid @RequestBody LoanDto loanDto){
        return "loan";
    }
}
