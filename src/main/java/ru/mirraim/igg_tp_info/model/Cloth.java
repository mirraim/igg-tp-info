package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cloth")
@NoArgsConstructor
@AllArgsConstructor
public class Cloth {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    // todo валидация, от 1 до 6
    private Integer stars;
    @ManyToOne
    private Setting setting;
    @ManyToOne
    private ClothingType type;
    @ManyToOne
    private Color color;
    private String source;
}
