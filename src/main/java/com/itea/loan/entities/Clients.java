package com.itea.loan.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}
