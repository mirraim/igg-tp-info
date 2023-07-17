package ru.mirraim.igg_tp_info.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirraim.igg_tp_info.exception.BadRequestException;
import ru.mirraim.igg_tp_info.model.ClothingType;
import ru.mirraim.igg_tp_info.repository.ClothingTypeRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClothingTypeService {
    private final ClothingTypeRepository repository;
    private Map<String, ClothingType> types;

    @Transactional
    public ClothingType get(String name) {
        if (types == null) {
            types = findAll().stream().collect(Collectors.toMap(
                    ClothingType::getName,
                    type -> type
            ));
        }
        if (!types.containsKey(name)) {
            throw new BadRequestException("Тип одежды не существует");
        }
        return types.get(name);
    }

    @Transactional
    public List<ClothingType> findAll() {
        return repository.findAll();
    }
}
