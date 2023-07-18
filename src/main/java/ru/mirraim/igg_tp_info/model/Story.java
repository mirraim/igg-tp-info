package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "story")
@NoArgsConstructor
public class Story {
    @Id
    @SequenceGenerator(name = "story_gen",sequenceName = "story_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "story_gen")
    private Integer id;
    private String name;

    public Story(String name) {
        this.name = name;
    }
}
