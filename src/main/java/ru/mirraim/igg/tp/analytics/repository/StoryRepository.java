package ru.mirraim.igg.tp.analytics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mirraim.igg.tp.analytics.domain.entity.Story;

import java.util.UUID;

@Repository
public interface StoryRepository extends CrudRepository<Story, UUID> {
}
