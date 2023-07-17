package ru.mirraim.igg_tp_info.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.dto.ClothRequest;
import ru.mirraim.igg_tp_info.model.Cloth;
import ru.mirraim.igg_tp_info.model.ClothingType;
import ru.mirraim.igg_tp_info.model.Color;
import ru.mirraim.igg_tp_info.model.Setting;
import ru.mirraim.igg_tp_info.repository.ClothRepository;
import ru.mirraim.igg_tp_info.service.search.SearchService;

@Service
@RequiredArgsConstructor
public class ClothService {
    private final ClothRepository clothRepository;
    private final SettingService settingService;
    private final SearchService<ClothingType> typeService;
    private final SearchService<Color> colorService;

    public Cloth createOrUpdate(ClothRequest clothReq) {
        Cloth cloth = clothRepository.getByName(clothReq.name()).orElse(new Cloth(clothReq.name()));
        cloth.setSetting(settingService.getSetting(clothReq.setting()));
        cloth.setStars(clothReq.stars());
        cloth.setColor(colorService.get(clothReq.color()));
        cloth.setType(typeService.get(clothReq.type()));
        cloth.setSource(clothReq.source());
        return clothRepository.save(cloth);
    }

    public Cloth createOrUpdate(Setting setting, ClothRequest clothReq) {
        Cloth cloth = clothRepository.getByName(clothReq.name()).orElse(new Cloth(clothReq.name()));
        if (setting.getId() == null) {
            setting = settingService.getSetting(setting.getName());
        }
        cloth.setSetting(setting);
        cloth.setStars(clothReq.stars());
        cloth.setColor(colorService.get(clothReq.color()));
        cloth.setType(typeService.get(clothReq.type()));
        cloth.setSource(clothReq.source());
        return clothRepository.save(cloth);
    }
}
