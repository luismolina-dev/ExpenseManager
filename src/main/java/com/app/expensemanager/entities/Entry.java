package com.app.expensemanager.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Table(name = "entries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entry {

    @Id
    @GeneratedValue
    private Long id;

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
