package com.app.expensemanager.services;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.entities.Entry;
import com.app.expensemanager.repositories.EntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntryService {

    private final EntryRepository entryRepository;

    public EntryDto convertToDto(Entry entry){
        EntryDto entryDto = new EntryDto();
        entryDto.setId(entry.getId());
        entryDto.setAmount(entry.getAmount());
        entryDto.setCategory(entry.getCategory());
        entryDto.setType(entry.getType());
        entryDto.setDate(entry.getDate());
        return entryDto;
    }

    public EntryDto createEntry(EntryDto entryDto){
        Entry entry = new Entry();
        entry.setAmount(entryDto.getAmount());
        entry.setCategory(entryDto.getCategory());
        entry.setType(entryDto.getType());
        entry.setDate(entryDto.getDate());
        Entry savedEntry = entryRepository.save(entry);

        return convertToDto(savedEntry);
    }

    public List<EntryDto> getAllEntries(){
        return entryRepository.findAll().stream().map(this::convertToDto).toList();
    }

}
