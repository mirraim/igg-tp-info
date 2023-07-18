package ru.mirraim.igg_tp_info.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SceneEnum {
    COURT_DANCE("Придворные танцы", "танец"),
    AFTERNOON_TEA("Послеобеденный чай", "чайник и чашка"),
    GILDED_AGE("Позолоченный век", "телефон"),
    ASTOUNDING_EPISODE("Поразительный эпизод", "воздушный шар"),
    FOREGIN_SCENERY("Зарубежные пейзажи", "восточный дворец"),
    MAGICAL_ADVENTURE("Волшебное приключение", "фея и гриб"),
    WONDROUS_JOURNEY("Чудесное путешествие", "книга"),
    ORIENTAL_FANTASY("Восточная фантазия", "веер и китайский фонарик"),
    STYLED_ALL_OVER("Стилизовано все", "город"),
    ROMANTIC_POEM("Романтическая поэма", "розы"),
    STARRY_LEGEND("Звездная легенда", "сатурн и звезды"),
    PHANTOM_LIGHT("Призрачный свет", "спираль");

    private final String description;
    private final String icon;

}
