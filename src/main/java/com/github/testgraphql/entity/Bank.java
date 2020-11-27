package com.github.testgraphql.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "number")
    private String number;
    @Column(name = "payment_line")
    private String paymentLine;
    @Column(name = "line_number")
    private String lineNumber;
    @Column(name = "city_code")
    private String cityCode;
    @Column(name = "bank_name")
    private String bankName;

}

