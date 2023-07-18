package ru.mirraim.igg_tp_info.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.model.Tag;
import ru.mirraim.igg_tp_info.model.Tuple;
import ru.mirraim.igg_tp_info.repository.TupleRepository;
import ru.mirraim.igg_tp_info.service.search.TagService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TupleService {
    private final TupleRepository tupleRepository;
    private final TagService tagService;

    @Transactional
    public Tuple getByTags(Set<String> tagNames) {
        Set<Tag> tags = tagNames.stream()
                .map(tagService::get)
                .collect(Collectors.toSet());
        List<Tuple> tuples = tupleRepository.findByTags(tags);
        return tuples.stream()
                .filter(tuple -> tuple.getTags().equals(tags))
                .findFirst()
                .orElseGet(() -> tupleRepository.save(new Tuple(tags)));
    }

}
