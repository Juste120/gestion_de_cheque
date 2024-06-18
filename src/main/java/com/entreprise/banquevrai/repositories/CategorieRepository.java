package com.entreprise.banquevrai.repositories;


import com.entreprise.banquevrai.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {

}
