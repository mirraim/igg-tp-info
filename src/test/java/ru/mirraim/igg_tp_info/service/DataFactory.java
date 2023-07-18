package ru.mirraim.igg_tp_info.service;

import ru.mirraim.igg_tp_info.dto.SettingItems;
import ru.mirraim.igg_tp_info.dto.SettingItems.Item;
import ru.mirraim.igg_tp_info.dto.SettingRequest;

import java.util.Set;

import static ru.mirraim.igg_tp_info.model.enumeration.ColorEnum.BLACK;
import static ru.mirraim.igg_tp_info.model.enumeration.ColorEnum.BLUE_GREEN;
import static ru.mirraim.igg_tp_info.model.enumeration.ColorEnum.METALLIC;
import static ru.mirraim.igg_tp_info.model.enumeration.ColorEnum.PURPLE;
import static ru.mirraim.igg_tp_info.model.enumeration.SceneEnum.MAGICAL_ADVENTURE;
import static ru.mirraim.igg_tp_info.model.enumeration.SourceEnum.GIFT;
import static ru.mirraim.igg_tp_info.model.enumeration.TagEnum.CHARMING;
import static ru.mirraim.igg_tp_info.model.enumeration.TagEnum.FIERCE;

public class DataFactory {

    static SettingRequest butterfly() {
        return new SettingRequest(
          "Бездонная бабочка",
                null,
                MAGICAL_ADVENTURE.getScene(),
                Set.of(FIERCE.getTag(), CHARMING.getTag()),
                SettingItems.getInstance()
                        .hair(new Item("Тихая боевая зона", 5, GIFT, BLUE_GREEN))
                        .shirt(new Item("Бездонная бабочка", 6, GIFT, PURPLE))
                        .skirt(new Item("Руководство", 6, GIFT, PURPLE))
                        .socks(new Item("Восстановленные осколки", 5, GIFT, BLACK))
                        .shoes(new Item("Тени пустоты", 4, GIFT, PURPLE))
                        .hairDecor(new Item("Тени в полете", 5, GIFT, METALLIC))
                        .earrings(new Item("Сумеречные циклы", 4, GIFT, PURPLE))
                        .bag(new Item("Заключение", 5, GIFT, PURPLE))
                        .gloves(new Item("Лунная бездна", 5, GIFT, PURPLE))
                        .necklet(new Item("Разбитое возвращение домой", 5, GIFT, PURPLE))
                        .hat(new Item("Эмоциональные американские горки", 6, GIFT, PURPLE))
                        .armBracelet(new Item("Взяв лук", 5, GIFT, PURPLE))
                        .manicure(new Item("Остаточное тепло", 6, GIFT, PURPLE))
                        .ring(new Item("Осенний поцелуй", 5, GIFT, METALLIC))
                        .makeup(new Item("Душевный пируэт", 6, GIFT, PURPLE))
                        .wings(new Item("Крылья Плача", 6, GIFT, PURPLE))
        );
    }


}
