package com.itea.loan.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class ClientDto {
    @NotBlank
    @Length(max = 255, min =10)
    private String clientName;
    @NotBlank
    private int age;
    @NotBlank
    @Length(max = 255, min =20)
    private String address;
    @NotBlank
    @Length(max = 6, min =1)
    private String sex;
    @NotBlank
    private Date birthday;
    @NotBlank
    @Length(max = 15, min =10)
    private String ipn;
    @NotBlank
    @Length(max = 255, min =5)
    private String passport;

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
}
