package ru.mirraim.igg_tp_info.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mirraim.igg_tp_info.model.enumeration.ClothingTypeEnum;
import ru.mirraim.igg_tp_info.model.enumeration.ColorEnum;
import ru.mirraim.igg_tp_info.model.enumeration.SourceEnum;

import java.util.HashMap;
import java.util.Map;

import static ru.mirraim.igg_tp_info.model.enumeration.ClothingTypeEnum.*;

@Data
@NoArgsConstructor
public class SettingItems {
    private final Map<ClothingTypeEnum, ClothRequest> items = new HashMap<>();

    public static SettingItems getInstance() {
        return new SettingItems();
    }

    public SettingItems hat(Item item) {
        items.put(HAT, buildItem(item, HAT));
        return this;
    }

    public SettingItems hairDecor(Item item) {
        items.put(HAIR_DECOR, buildItem(item, HAIR_DECOR));
        return this;
    }
    public SettingItems hair(Item item){
        items.put(HAIR, buildItem(item, HAIR));
        return this;
    }
    public SettingItems faceDecor(Item item){
        items.put(FACE_DECOR, buildItem(item, FACE_DECOR));
        return this;
    }
    public SettingItems dress(Item item){
        items.put(DRESS, buildItem(item, DRESS));
        return this;
    }
    public SettingItems shirt(Item item){
        items.put(SHIRT, buildItem(item, SHIRT));
        return this;
    }
    public SettingItems trousers(Item item){
        items.put(TROUSERS, buildItem(item, TROUSERS));
        return this;
    }
    public SettingItems skirt(Item item){
        items.put(SCIRT, buildItem(item, SCIRT));
        return this;
    }
    public SettingItems shoes(Item item){
        items.put(SHOES, buildItem(item, SHOES));
        return this;
    }
    public SettingItems socks(Item item){
        items.put(SOCKS, buildItem(item, SOCKS));
        return this;
    }
    public SettingItems legBracelet(Item item){
        items.put(LEG_BRACELET, buildItem(item, LEG_BRACELET));
        return this;
    }
    public SettingItems necklet(Item item){
        items.put(NECKLET, buildItem(item, NECKLET));
        return this;
    }
    public SettingItems earrings(Item item){
        items.put(EARRINGS, buildItem(item, EARRINGS));
        return this;
    }
    public SettingItems gloves(Item item){
        items.put(GLOVES, buildItem(item, GLOVES));
        return this;
    }
    public SettingItems armBracelet(Item item){
        items.put(ARM_BRACELET, buildItem(item, ARM_BRACELET));
        return this;
    }
    public SettingItems ring(Item item){
        items.put(RING, buildItem(item, RING));
        return this;
    }
    public SettingItems bag(Item item){
        items.put(BAG, buildItem(item, BAG));
        return this;
    }
    public SettingItems makeup(Item item){
        items.put(MAKEUP, buildItem(item, MAKEUP));
        return this;
    }
    public SettingItems manicure(Item item){
        items.put(MANICURE, buildItem(item, MANICURE));
        return this;
    }
    public SettingItems wings(Item item){
        items.put(WINGS, buildItem(item, WINGS));
        return this;
    }
    public SettingItems background(Item item){
        items.put(BACKGROUND, buildItem(item, BACKGROUND));
        return this;
    }
    public SettingItems interior(Item item){
        items.put(INTERIOR, buildItem(item, INTERIOR));
        return this;
    }

    private ClothRequest buildItem(Item item, ClothingTypeEnum type) {
        return new ClothRequest(item.name(), item.stars(), null, type, item.source(), item.color());
    }


    public record Item(
            String name,
            Integer stars,
            SourceEnum source,
            ColorEnum color) {
    }
}
