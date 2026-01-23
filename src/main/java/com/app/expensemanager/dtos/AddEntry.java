package com.app.expensemanager.dtos;

import com.app.expensemanager.entities.Category;
import com.app.expensemanager.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEntry {
    Double amount;
    Category category;
    Type type;
    LocalDate date;
}
