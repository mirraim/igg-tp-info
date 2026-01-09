package ru.mirraim.igg.tp.analytics.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;
import ru.mirraim.igg.tp.analytics.domain.enums.Color;
import ru.mirraim.igg.tp.analytics.domain.enums.TagType;

/**
 * Тэги
 */
@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tag {
    @Id
    Integer id;

    /**
     * Код тэга
     */
    String code;

    /**
     * Наименование тэга
     */
    String name;

    /**
     * Тип тэга
     */
    TagType tagType;

    /**
     * Цвет тэга
     */
    Color color;
}
