package ru.mirraim.igg_tp_info.service.search;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Scene;
import ru.mirraim.igg_tp_info.repository.SceneRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SceneService implements SearchService<Scene> {
    private final SceneRepository repository;
    private Map<String, Scene> scenes;

    @Override
    @Transactional
    public Scene get(String name) {
        if (scenes == null) {
            scenes = findAll().stream().collect(Collectors.toMap(
                    Scene::getName,
                    scene -> scene
            ));
        }
        if (!scenes.containsKey(name)) {
            throw new BadRequestException("Сцена не существует");
        }
        return scenes.get(name);
    }

    @Override
    @Transactional
    public List<Scene> findAll() {
        return repository.findAll();
    }
}