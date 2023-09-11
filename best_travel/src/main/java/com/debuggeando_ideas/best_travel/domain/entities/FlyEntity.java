package com.debuggeando_ideas.best_travel.domain.entities;

import com.debuggeando_ideas.best_travel.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.springframework.jdbc.core.CallableStatementCallback;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity(name="fly")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//NoArgsConstructor es para que lombook cree un construcctor sin parametros
//Data es para los getters y setters con lombook
public class FlyEntity implements Serializable {
    //Serializable ya no es obligatorio en las nuevas versiones
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinyLng;
    private Double destinyLat;
    private BigDecimal price;
    @Column(length = 20)
    private String origin_name;
    @Column(length = 20)
    private String destiny_name;
    //Para las aerolineas tendremos un enum y usaremos la anotacion enumerated
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;

    @OneToMany(
            cascade = CascadeType.ALL, //Opciones de borrado
            fetch = FetchType.EAGER, //Opciones de recuperar objeto EAGER con joins de tickets
            orphanRemoval = true,
            mappedBy = "fly" //Nombre de la entidad FlyEntity en el objeto TicketEntity
    )
    private Set<TicketEntity> tickets;





}
