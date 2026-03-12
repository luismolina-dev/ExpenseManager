package com.app.expensemanager.dtos;

import com.app.expensemanager.entities.Category;
import com.app.expensemanager.entities.Type;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EntryResponse {
    Long id;
    Double amount;
    Category category;
    Type type;
    LocalDate date;
}
