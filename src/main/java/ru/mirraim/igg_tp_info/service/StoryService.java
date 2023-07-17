package ru.mirraim.igg_tp_info.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Story;
import ru.mirraim.igg_tp_info.repository.StoryRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StoryService {
    private final StoryRepository repository;
    private Map<String, Story> stories;

    @Transactional
    public Story get(String name) {
        if (stories == null) {
            stories = findAll().stream().collect(Collectors.toMap(
                    Story::getName,
                    story -> story
            ));
        }
        if (!stories.containsKey(name)) {
            throw new BadRequestException("История не существует");
        }
        return stories.get(name);
    }

    @Transactional
    public List<Story> findAll() {
        return repository.findAll();
    }
}
