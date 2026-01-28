package com.app.expensemanager.controllers;

import com.app.expensemanager.dtos.EntryDto;
import com.app.expensemanager.services.EntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/entries")
public class EntryController {

    private final EntryService entryService;

    @PostMapping("/")
    public ResponseEntity<EntryDto> createEntry(@RequestBody EntryDto entryDto){
        return ResponseEntity.ok(entryService.createEntry(entryDto));
    }

    @GetMapping("/")
    public ResponseEntity<List<EntryDto>> getAllEntries(){
        return ResponseEntity.ok(entryService.getAllEntries());
    }

    @GetMapping("/{entryId}")
    public ResponseEntity<EntryDto> getEntryById(@PathVariable Integer entryId){
        return ResponseEntity.ok(entryService.getById(entryId));
    }

    @PatchMapping("/{entryId}")
    public ResponseEntity<EntryDto> updateEntry(@PathVariable Integer entryId, @RequestBody EntryDto entryDto){
        return ResponseEntity.ok(entryService.updateEntry(entryId, entryDto));
    }

    @DeleteMapping("/{entryId}")
    public ResponseEntity<Void> deleteEntry(@PathVariable Integer entryId){
        entryService.delete(entryId);

        return  ResponseEntity.noContent().build();
    }
}
