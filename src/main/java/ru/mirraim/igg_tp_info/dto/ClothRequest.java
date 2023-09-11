package ru.mirraim.igg_tp_info.dto;

import ru.mirraim.igg_tp_info.model.enumeration.ClothingTypeEnum;
import ru.mirraim.igg_tp_info.model.enumeration.ColorEnum;
import ru.mirraim.igg_tp_info.model.enumeration.SourceEnum;

public record ClothRequest(
        String name,
        Integer stars,
        ClothingTypeEnum type,
        SourceEnum source,
        ColorEnum color) {
}
