package com.app.expensemanager.mappers;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.dtos.EntryResponse;
import com.app.expensemanager.entities.Entry;
import org.springframework.stereotype.Component;

@Component
public class EntryMapper {

    public Entry toEntity(EntryDto entryDto) {
        return Entry.builder()
                .amount(entryDto.getAmount())
                .category(entryDto.getCategory())
                .type(entryDto.getType())
                .date(entryDto.getDate())
                .build();
    }

    public void updateEntity(Entry entry, EntryDto entryDto) {
        entry.setAmount(entryDto.getAmount());
        entry.setCategory(entryDto.getCategory());
        entry.setType(entryDto.getType());
        entry.setDate(entryDto.getDate());
    }

    public EntryResponse toResponse(Entry entry) {
        return EntryResponse.builder()
                .id(entry.getId())
                .amount(entry.getAmount())
                .category(entry.getCategory())
                .type(entry.getType())
                .date(entry.getDate())
                .build();
    }
}
