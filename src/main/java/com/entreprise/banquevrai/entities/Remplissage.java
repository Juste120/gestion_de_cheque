package com.entreprise.banquevrai.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "remplissage")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Remplissage implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID trackingId;

    private String reference;
    private Date date;
    private String user;

}