package com.itea.loan.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class CurrencyDto {
    @NotBlank
    @Length(max=50, min = 5)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
