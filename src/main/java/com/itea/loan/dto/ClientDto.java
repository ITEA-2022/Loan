package com.itea.loan.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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
    //@NotBlank
    private Date birthday;
    @NotBlank
    @Length(max = 15, min =10)
    private String ipn;
    @NotBlank
    @Length(max = 255, min =5)
    private String passport;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotBlank
    @Email
    @Unique
    private String email;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
