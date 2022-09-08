package com.itea.loan.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class LoansDto {

    @NotBlank
    private Long client_id;
    @NotBlank
    private Long type;
    @NotBlank
    private double sum;
    @NotBlank
    private Long currency_id;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Long getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Long currency_id) {
        this.currency_id = currency_id;
    }
}
