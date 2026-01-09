package ru.mirraim.igg.tp.analytics.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;
import ru.mirraim.igg.tp.analytics.domain.enums.MaterialCode;

import java.util.UUID;

/**
 * Материал изготовления
 */
@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Material {
    /**
     * Идентификатор материала
     */
    @Id
    UUID id;

    /**
     * Код материала
     */
    @EqualsAndHashCode.Include
    MaterialCode code;

    /**
     * Наименование материала
     */
    String name;
}
