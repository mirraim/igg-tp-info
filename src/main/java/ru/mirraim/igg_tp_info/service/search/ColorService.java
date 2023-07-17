package ru.mirraim.igg_tp_info.service.search;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.Color;
import ru.mirraim.igg_tp_info.repository.ColorRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ColorService implements SearchService<Color> {
    private final ColorRepository repository;
    private Map<String, Color> colors;

    @Override
    @Transactional
    public Color get(String name) {
        if (colors == null) {
            colors = findAll().stream().collect(Collectors.toMap(
                    Color::getName,
                    color -> color
            ));
        }
        if (!colors.containsKey(name)) {
            throw new BadRequestException("Цвет не существует");
        }
        return colors.get(name);
    }

    @Override
    @Transactional
    public List<Color> findAll() {
        return repository.findAll();
    }
}