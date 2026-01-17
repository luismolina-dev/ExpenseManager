package com.app.expensemanager.entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.time.LocalDate;

@Entity
@DataAmount
@Table(name = "entries")
public class Entries {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "type")
    private Type type;

    @Column(name = "date")
    private LocalDate date;
}
