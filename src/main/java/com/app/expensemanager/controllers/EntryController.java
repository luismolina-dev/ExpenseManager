package com.app.expensemanager.controllers;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.services.EntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/entries")
public class EntryController {

    private final EntryService entryService;

    @PostMapping("/")
    public EntryDto createEntry(@RequestBody EntryDto entryDto){
        return entryService.createEntry(entryDto);
    }

    @GetMapping("/")
    public List<EntryDto> getAllEntries(){
        return entryService.getAllEntries();
    }
}
