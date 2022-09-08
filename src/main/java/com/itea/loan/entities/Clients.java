package com.itea.loan.entities;

import javax.persistence.*;

@Entity
@Table(name = "l_clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String client_name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, length = 6)
    private String sex;

    @Column(nullable = false)
    private String birth_day;

    @Column(nullable = false, length = 15)
    private String ipn;

    @Column(nullable = false, length = 15)
    private String passport;

    public Clients() {
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
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

    public Clients(String client_name, int age, String address, String sex, String birth_day, String ipn, String passport) {
        this.client_name = client_name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.birth_day = birth_day;
        this.ipn = ipn;
        this.passport = passport;
    }
}
