package com.entreprise.banquevrai.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "beneficiaire")
public class Beneficiaire implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID trackingId;

    private String nom;
    private String contact;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}