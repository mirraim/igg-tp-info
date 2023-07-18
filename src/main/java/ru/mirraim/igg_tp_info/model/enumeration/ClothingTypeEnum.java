package ru.mirraim.igg_tp_info.model.enumeration;

import lombok.Getter;

@Getter
public enum ClothingTypeEnum {
     HAT("Шляпа"),
     HAIR_DECOR("Заколка"),
     HAIR("Прическа"),
     FACE_DECOR("Аксессуар на лицо"),
     DRESS("Платье"),
     SHIRT("Блуза"),
     TROUSERS("Брюки"),
     SCIRT("Юбка"),
     SHOES("Туфли"),
     SOCKS("Чулки"),
     LEG_BRACELET("Браслет на ногу"),
     NECKLET("Ожерелье"),
     EARRINGS("Серьги"),
     GLOVES("Перчатки"),
     ARM_BRACELET("Браслет на руку"),
     RING("Кольцо"),
     BAG("Сумка"),
     MAKEUP("Мэйк"),
     MANICURE("Маникюр"),
     WINGS("Крылья"),
     BACKGROUND("Фон"),
     INTERIOR("Интерьер");

    private final String description;

    ClothingTypeEnum(String description) {
        this.description = description;
    }
}
