package com.entreprise.banquevrai.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "banque")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Banque implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID trackingId;

    private String code;
    private String libelle;

}
