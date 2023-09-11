package ru.mirraim.igg_tp_info.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.dto.ClothRequest;
import ru.mirraim.igg_tp_info.dto.SettingRequest;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Cloth;
import ru.mirraim.igg_tp_info.model.Setting;
import ru.mirraim.igg_tp_info.service.look.ClothService;
import ru.mirraim.igg_tp_info.service.look.SettingService;

@Service
@RequiredArgsConstructor
public class LookService {
    private final SettingService settingService;
    private final ClothService clothService;

    public Setting createFullSet(SettingRequest settingReq) {
        Setting setting = settingService.createOrUpdate(settingReq);
        if (settingReq.items() == null) {
            throw new BadRequestException("Добавьте предметы в сет");
        }
        settingReq.items().getItems().values().forEach(item -> clothService.createOrUpdate(setting, item));
        return setting;
    }

    public Cloth createSingleCloth(ClothRequest clothReq) {
        return clothService.createOrUpdate(clothReq);
    }
}
