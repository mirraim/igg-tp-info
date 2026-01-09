package ru.mirraim.igg.tp.analytics.domain.entity;


import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;
import ru.mirraim.igg.tp.analytics.domain.enums.GiftCode;

import java.util.List;
import java.util.UUID;

/**
 * Подарок
 */
@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Gift {
    /**
     * Идентификатор материала
     */
    @Id
    UUID id;

    /**
     * Код подарка
     */
    @EqualsAndHashCode.Include
    GiftCode code;

    /**
     * Наименование подарка
     */
    String name;

    /**
     * Список материалов
     */
    List<Material> materials;
}
