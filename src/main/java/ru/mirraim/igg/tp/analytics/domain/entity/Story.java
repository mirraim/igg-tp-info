package ru.mirraim.igg.tp.analytics.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;
import java.util.UUID;

/**
 * История
 */
@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Story {

    /**
     * Идентификатор истории
     */
    @Id
    @EqualsAndHashCode.Include
    UUID id;

    /**
     * Наименование истории
     */
    @EqualsAndHashCode.Include
    String name;

    /**
     * Список спутников
     */
    @MappedCollection(idColumn = "story_id")
    Set<Companion> companions;
}
