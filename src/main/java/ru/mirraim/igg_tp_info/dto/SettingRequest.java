package ru.mirraim.igg_tp_info.dto;

import java.util.Set;

public record SettingRequest(String name, String story, String scene, Set<String> tags) {
}
