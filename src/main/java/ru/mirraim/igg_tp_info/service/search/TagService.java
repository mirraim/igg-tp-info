package ru.mirraim.igg_tp_info.service.search;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Tag;
import ru.mirraim.igg_tp_info.repository.TagRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TagService implements SearchService<Tag> {
    private final TagRepository repository;
    private Map<String, Tag> tags;

    @Override
    @Transactional
    public Tag get(String name) {
        if (tags == null) {
            tags = findAll().stream().collect(Collectors.toMap(
                    Tag::getName,
                    tag -> tag
            ));
        }
        if (!tags.containsKey(name)) {
            throw new BadRequestException("Тэг не существует");
        }
        return tags.get(name);
    }

    @Override
    @Transactional
    public List<Tag> findAll() {
        return repository.findAll();
    }
}