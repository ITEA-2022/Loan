package com.itea.loan.controllers.interfaces;

import lombok.Getter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import java.util.Date;

public interface ClientInteface {
    Long getId();
    String getClientName();
    int getAge();
    String getAddress();
    String getSex();
    Date getBirthday();
    String getIpn();
    String getPassport();
    String getEmail();
}
