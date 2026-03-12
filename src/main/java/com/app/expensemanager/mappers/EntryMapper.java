package com.app.expensemanager.mappers;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.dtos.EntryResponse;
import com.app.expensemanager.entities.Entry;
import org.springframework.stereotype.Component;

@Component
public class EntryMapper implements EntityMapper<EntryDto, Entry>{

    @Override
    public Entry toEntity(EntryDto entryDto) {
        Entry entry = new Entry();
        entry.setAmount(entryDto.getAmount());
        entry.setCategory(entryDto.getCategory());
        entry.setType(entryDto.getType());
        entry.setDate(entryDto.getDate());
        return entry;
    }

    @Override
    public void updateEntity(Entry entry, EntryDto entryDto) {
        entry.setAmount(entryDto.getAmount());
        entry.setCategory(entryDto.getCategory());
        entry.setType(entryDto.getType());
        entry.setDate(entryDto.getDate());
    }

    @Override
    public EntryResponse toDto(Entry entry) {
        EntryResponse entryDto = new EntryResponse();
        entryDto.setId(entry.getId());
        entryDto.setAmount(entry.getAmount());
        entryDto.setCategory(entry.getCategory());
        entryDto.setType(entry.getType());
        entryDto.setDate(entry.getDate());
        return entryDto;
    }

}
