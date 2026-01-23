package com.app.expensemanager.repositories;

import com.app.expensemanager.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    Entry getById(Integer id);
}
