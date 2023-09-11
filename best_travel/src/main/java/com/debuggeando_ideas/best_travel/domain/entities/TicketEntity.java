package com.debuggeando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TicketEntity implements Serializable {

    @Id
    private UUID id;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private LocalDateTime purchaseDate;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "fly_id")//El nombre de la columna de la fk en la tabla ticket
    private FlyEntity fly;

    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = false) //nomnre de la fk en la tabla ticket
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name = "customer_id") //nombre de la llave foranea en la tabla ticker
    private CustomerEntity customer;
}
