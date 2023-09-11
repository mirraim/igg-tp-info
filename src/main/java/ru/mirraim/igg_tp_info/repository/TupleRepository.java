package ru.mirraim.igg_tp_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.mirraim.igg_tp_info.model.Tag;
import ru.mirraim.igg_tp_info.model.Tuple;

import java.util.List;
import java.util.Set;

@Repository
public interface TupleRepository extends JpaRepository<Tuple, Integer> {

    @Query("select t from Tuple t join fetch t.tags tag where tag in :tags")
    List<Tuple> findByTags(Set<Tag> tags);
}
