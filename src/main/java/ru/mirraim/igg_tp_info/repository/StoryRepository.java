package ru.mirraim.igg_tp_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirraim.igg_tp_info.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {
}
