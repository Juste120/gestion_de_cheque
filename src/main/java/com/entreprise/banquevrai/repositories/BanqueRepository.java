package com.entreprise.banquevrai.repositories;


import com.entreprise.banquevrai.entities.Banque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<Banque,Long> {
}
