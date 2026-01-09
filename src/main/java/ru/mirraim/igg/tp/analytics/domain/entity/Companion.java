package ru.mirraim.igg.tp.analytics.domain.entity;


import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.util.UUID;

/**
 * Спутник
 */
@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Companion {

    /**
     * Идентификатор спутника
     */
    @Id
    @EqualsAndHashCode.Include
    UUID id;

    /**
     * Наименование спутника
     */
    @EqualsAndHashCode.Include
    String name;
}
