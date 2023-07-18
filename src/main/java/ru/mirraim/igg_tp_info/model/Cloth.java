package ru.mirraim.igg_tp_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.mirraim.igg_tp_info.model.enumeration.SourceEnum;

@Getter
@Setter
@Entity
@Table(name = "cloth")
@NoArgsConstructor
@AllArgsConstructor
public class Cloth {

    @Id
    @SequenceGenerator(name = "cloth_gen",sequenceName = "cloth_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cloth_gen")
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
    @Enumerated(EnumType.STRING)
    private SourceEnum source;

    public Cloth(String name) {
        this.name = name;
    }
}
