package com.itea.loan.entities;

import javax.persistence.*;

@Entity
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long client_id;

    @Column(nullable = false)
    private Long type;

    @Column(nullable = false)
    private double sum;

    @Column(nullable = false)
    private Long currency_id;
}
