package ru.mirraim.iggtpinfo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cloth")
public class Cloth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // todo валидация, от 1 до 6
    private Integer stars;
    @ManyToOne
    private Tuple tuple;
    @ManyToOne
    private Scene scene;
    @ManyToOne
    private Story story;
    @ManyToOne
    private Setting setting;
    @ManyToOne
    private ClothingType type;
}
