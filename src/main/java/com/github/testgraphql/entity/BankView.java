package com.github.testgraphql.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bank_view")
public class BankView {

    @Id
    @Column(name = "bank_category")
    private String bankCategory;

    @Column(name = "bank_name")
    private String bankName;


}
