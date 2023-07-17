package ru.mirraim.igg_tp_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirraim.igg_tp_info.model.Tag;
import ru.mirraim.igg_tp_info.model.Tuple;

import java.util.Optional;
import java.util.Set;

@Repository
public interface TupleRepository extends JpaRepository<Tuple, Integer> {

    Optional<Tuple> findByTags(Set<Tag> tags);
}
