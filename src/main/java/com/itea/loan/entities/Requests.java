package com.itea.loan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
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
    @Getter
    @Setter
    private double sum;

    @Column(nullable = false)
    private Date date_request;

    @Column(nullable = false)
    private Date date_of_status;


    public Requests(Long client_id, int status, Long type, Long manager_id, double sum, Date date_request, Date date_of_status) {
        this.client_id = client_id;
        this.status = status;
        this.type = type;
        this.manager_id = manager_id;
        this.sum = sum;
        this.date_request = date_request;
        this.date_of_status = date_of_status;
    }
}
