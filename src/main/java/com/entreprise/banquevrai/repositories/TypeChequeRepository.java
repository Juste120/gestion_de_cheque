package com.entreprise.banquevrai.repositories;


import com.entreprise.banquevrai.entities.TypeCheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeChequeRepository  extends JpaRepository<TypeCheque, Long> {
}
