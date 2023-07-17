package ru.mirraim.igg_tp_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirraim.igg_tp_info.model.Cloth;

import java.util.Optional;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, Long> {
    Optional<Cloth> getByName(String name);
}
