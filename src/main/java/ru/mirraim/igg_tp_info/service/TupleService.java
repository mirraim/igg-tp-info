package ru.mirraim.igg_tp_info.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.model.Tag;
import ru.mirraim.igg_tp_info.model.Tuple;
import ru.mirraim.igg_tp_info.repository.TupleRepository;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TupleService {
    private final TupleRepository tupleRepository;
    private final TagService tagService;

    @Transactional
    public Tuple getByTags(String firstTag, String secondTag) {
        Set<Tag> tags = Set.of(tagService.get(firstTag), tagService.get(secondTag));
        Optional<Tuple> tuple = tupleRepository.findByTags(tags);
        return tuple.orElseGet(() -> tupleRepository.save(new Tuple(tags)));
    }

}
