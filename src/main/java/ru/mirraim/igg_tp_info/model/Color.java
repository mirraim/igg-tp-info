package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "color")
@NoArgsConstructor
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "color_gen")
    @SequenceGenerator(name = "color_gen",sequenceName = "color_id_seq", allocationSize = 1)
    private Integer id;
    private String name;

    public Color(String name) {
        this.name = name;
    }
}
