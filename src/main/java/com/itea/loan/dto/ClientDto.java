package com.itea.loan.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.bytebuddy.pool.TypePool;
import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.Date;

public class ClientDto {
    @NotBlank
    @Length(max = 255, min =10)
    private String clientName;
    private int age;
    @NotBlank
    @Length(max = 255, min =20)
    private String address;
    @NotBlank
    @Length(max = 6, min =1)
    private String sex;
    @NotBlank
    private String birth_day;
    @NotBlank
    @Length(max = 15, min =10)
    private String ipn;
    @NotBlank
    @Length(max = 255, min =5)
    private String passport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String debugMessage;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getIpn() {
        return ipn;
    }

    public void setIpn(String ipn) {
        this.ipn = ipn;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public ClientDto(String message, String debugMessage) {
        this.message = message;
        this.debugMessage = debugMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDebugMessage() {
        if (debugMessage== null)
            debugMessage="New raw was added to DB";
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public ClientDto(String message) {
        this.message = message;
    }
}
