package entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.time.LocalDate;

@Entity
@DataAmount
@Table(name = "entries")
public class entries {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "type")
    private type type;

    @Column(name = "date")
    private LocalDate date;
}
