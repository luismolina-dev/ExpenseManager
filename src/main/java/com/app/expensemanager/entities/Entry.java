package com.app.expensemanager.entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.time.LocalDate;

@Entity
@DataAmount
@Table(name = "entries")
public class Entry {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "amount")
    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    @Column(name = "date")
    private LocalDate date;
}
