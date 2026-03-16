package com.app.expensemanager.repositories;

import com.app.expensemanager.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    @Query("SELECT SUM(e.amount) FROM Entry e WHERE e.type = 'income'")
    Double getTotalIncome();

    @Query("SELECT SUM(e.amount) FROM Entry e WHERE e.type = 'expense'")
    Double getTotalExpense();
}
