package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "setting")
@NoArgsConstructor
public class Setting {
    @Id
    @SequenceGenerator(name = "setting_gen",sequenceName = "setting_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "setting_gen")
    private Long id;
    private String name;
    @ManyToOne
    private Story story;
    @ManyToOne
    private Scene scene;
    @ManyToOne
    private Tuple tuple;

    public Setting(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Setting setting = (Setting) o;

        if (!name.equals(setting.name)) return false;
        if (!Objects.equals(story, setting.story)) return false;
        if (!scene.equals(setting.scene)) return false;
        return tuple.equals(setting.tuple);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
