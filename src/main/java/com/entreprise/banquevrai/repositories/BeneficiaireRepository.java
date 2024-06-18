package com.entreprise.banquevrai.repositories;


import com.entreprise.banquevrai.entities.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiaireRepository extends JpaRepository<Beneficiaire,Long> {
}
