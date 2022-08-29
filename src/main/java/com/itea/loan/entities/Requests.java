package com.itea.loan.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long client_id;

    @Column(nullable = false)
    private int status;

    @Column(nullable = false)
    private Long type;

    private Long manager_id;

    @Column(nullable = false)
    private double sum;

    @Column(nullable = false)
    private Date date_request;

    @Column(nullable = false)
    private Date date_of_status;


}
