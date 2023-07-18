package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "scene")
@NoArgsConstructor
public class Scene {
    @Id
    @SequenceGenerator(name = "scene_gen",sequenceName = "scene_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scene_gen")
    private Integer id;
    private String name;

    public Scene(String name) {
        this.name = name;
    }
}
