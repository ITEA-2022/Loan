package com.itea.loan.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class LoanDto {
    @NotBlank
    @Length(max = 50, min = 10)
    private String name;
}
