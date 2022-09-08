package com.itea.loan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, length = 6)
    private String sex;

    @Column(nullable = false)
    private Date birthday;

    @Column(nullable = false, length = 15)
    private String ipn;

    @Column(nullable = false, length = 15)
    private String passport;

    public Client(String clientName, int age, String address, String sex, Date birthday, String ipn, String passport) {
        this.clientName = clientName;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.birthday = birthday;
        this.ipn = ipn;
        this.passport = passport;
    }
}
