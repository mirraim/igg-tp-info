package ru.mirraim.igg_tp_info.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TagEnum {
    SIMPLE("Простой"),
    FORMAL("Формальный"),
    COOLING("Прохладный"),
    GRAND("Роскошный"),
    CHARMING("Очаровательный"),
    WARM("Теплый"),
    ELEGANT("Элегантный"),
    NOBLE("Благородный"),
    FIERCE("Свирепый"),
    PERKY("Дерзкий"),
    GENTLE("Изящный"),
    SWEET("Сладкий"),
    SENSIBLE("Здравомыслящий"),
    CASUAL("Повседневный");



    private final String description;
}
