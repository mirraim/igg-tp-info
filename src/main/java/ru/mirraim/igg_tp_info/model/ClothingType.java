package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clothing_type")
@NoArgsConstructor
public class ClothingType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clothing_type_gen")
    @SequenceGenerator(name = "clothing_type_gen",sequenceName = "clothing_type_id_seq", allocationSize = 1)
    private Integer id;
    private String name;

    public ClothingType(String name) {
        this.name = name;
    }
}
