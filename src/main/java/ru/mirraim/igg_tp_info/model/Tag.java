package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tag")
@NoArgsConstructor
public class Tag {

    @Id
    @SequenceGenerator(name = "tag_gen",sequenceName = "tag_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_gen")
    private Integer id;
    private String name;

    public Tag(String name) {
        this.name = name;
    }
}
