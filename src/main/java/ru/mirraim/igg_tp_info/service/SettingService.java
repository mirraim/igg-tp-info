package ru.mirraim.igg_tp_info.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.dto.SettingRequest;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Scene;
import ru.mirraim.igg_tp_info.model.Setting;
import ru.mirraim.igg_tp_info.model.Story;
import ru.mirraim.igg_tp_info.repository.SettingRepository;
import ru.mirraim.igg_tp_info.service.search.SearchService;

@Service
@RequiredArgsConstructor
public class SettingService {
    private final SettingRepository settingRepository;
    private final SearchService<Story> storyService;
    private final SearchService<Scene> sceneService;
    private final TupleService tupleService;

    @Transactional
    public Setting createOrUpdate(SettingRequest settingReq) {
        Setting setting = settingRepository.getByName(settingReq.name()).orElse(new Setting(settingReq.name()));
        setting.setStory(storyService.get(settingReq.story()));
        setting.setScene(sceneService.get(settingReq.scene()));
        setting.setTuple(tupleService.getByTags(settingReq.tags()));
        return settingRepository.save(setting);
    }

    @Transactional
    public Setting getSetting(String name) {
        return settingRepository.getByName(name).orElseThrow(
                () -> new BadRequestException("Набор не найден")
        );
    }
}
