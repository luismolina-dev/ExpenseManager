package com.app.expensemanager.dtos;

import com.app.expensemanager.entities.Category;
import com.app.expensemanager.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntryDto {
    Integer id;
    Double amount;
    Category category;
    Type type;
    LocalDate date;
}
