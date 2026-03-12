package com.app.expensemanager.mappers;

import com.app.expensemanager.dtos.EntryResponse;

public interface EntityMapper<Dto, Entity> {
    Entity toEntity(Dto dto);
    void updateEntity(Entity entity, Dto dto);
    EntryResponse toDto(Entity entity);
}
