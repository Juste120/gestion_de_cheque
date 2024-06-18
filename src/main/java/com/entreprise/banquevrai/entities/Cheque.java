package com.entreprise.banquevrai.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cheque")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cheque implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID trackingId;

    private String numero;
    private String serie;
    private double montant;
    private Date dateEdition;
    private String statut;


    @ManyToOne
    @JoinColumn(name = "type_cheque_id")
    private TypeCheque typeCheque;

    @ManyToOne
    @JoinColumn(name = "beneficiaire_id")
    private Beneficiaire beneficiaire;

    @ManyToOne
    @JoinColumn(name = "motif_id")
    private Motif motif;

    @ManyToOne
    @JoinColumn(name = "lieu_edition_id")
    private LieuEdition lieuEdition;

    @ManyToOne
    @JoinColumn(name = "remplissage_id")
    private Remplissage remplissage;


}