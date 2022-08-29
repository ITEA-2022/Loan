package com.itea.loan.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class RequestDto {
    @NotBlank
    private Long client_id;
    @NotBlank
    private int status;
    @NotBlank
    private Long type;

    private Long manager_id;
    @NotBlank
    private double sum;
    @NotBlank
    private Date date_request;
    @NotBlank
    private Date date_of_status;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getManager_id() {
        return manager_id;
    }

    public void setManager_id(Long manager_id) {
        this.manager_id = manager_id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getDate_request() {
        return date_request;
    }

    public void setDate_request(Date date_request) {
        this.date_request = date_request;
    }

    public Date getDate_of_status() {
        return date_of_status;
    }

    public void setDate_of_status(Date date_of_status) {
        this.date_of_status = date_of_status;
    }
}
