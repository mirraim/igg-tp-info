package ru.mirraim.igg_tp_info.dto;

import ru.mirraim.igg_tp_info.model.enumeration.SourceEnum;

public record ClothRequest(
        String name,
        Integer stars,
        String setting,
        String type,
        SourceEnum source,
        String color) {
}
