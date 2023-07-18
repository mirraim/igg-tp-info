package ru.mirraim.igg_tp_info.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ColorEnum {
    RED("красный"),
    BLACK("черный"),
    WHITE("белый"),
    PINK("розовый"),
    PURPLE("фиолетовый"),
    GRAY_BROWN("серо-коричневый"),
    ORANGE_YELLOW("желто-оранжевый"),
    BLUE_GREEN("сине-зеленый"),
    METALLIC("металлик"),
    COLORFUL("красочный"),
    PATTERN("узор"),
    COLOR_SWAP("замена цвета");

    private final String description;
}
