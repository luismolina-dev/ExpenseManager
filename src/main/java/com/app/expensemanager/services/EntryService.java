package com.app.expensemanager.services;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.dtos.EntryResponse;
import com.app.expensemanager.entities.Entry;
import com.app.expensemanager.mappers.EntryMapper;
import com.app.expensemanager.repositories.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    private final EntryRepository entryRepository;
    private final EntryMapper entryMapper;

    public EntryService(EntryRepository entryRepository, EntryMapper entryMapper) {
        this.entryRepository = entryRepository;
        this.entryMapper = entryMapper;
    }

    public EntryResponse createEntry(EntryDto entryDto){
        Entry entry = entryMapper.toEntity(entryDto);
        Entry savedEntry = entryRepository.save(entry);

        return entryMapper.toDto(savedEntry);
    }

    public List<EntryResponse> getAllEntries(){
        return entryRepository.findAll().stream().map(entryMapper::toDto).toList();
    }

    public EntryResponse getById(Integer id){
        Entry entry = entryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entry not found"));

        return entryMapper.toDto(entry);
    }

    public EntryResponse updateEntry(Integer id, EntryDto entryDto){
        Entry entry = entryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entry not found"));

        entryMapper.updateEntity(entry, entryDto);

        Entry updateEntry = entryRepository.save(entry);

        return entryMapper.toDto(updateEntry);
    }

    public void delete(Integer id){
        entryRepository.deleteById(id);
    }

}
