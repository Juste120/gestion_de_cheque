package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.response.BeneficiaireResponseDto;
import com.entreprise.banquevrai.DTO.response.CategorieResponseDto;
import com.entreprise.banquevrai.entities.Beneficiaire;
import com.entreprise.banquevrai.entities.Categorie;
import org.springframework.stereotype.Component;

@Component
public class CategorieMapper {
    public CategorieResponseDto toResponseDTO(Categorie categorie) {
        if (categorie == null) {
            return null;
        }

        return new CategorieResponseDto(
                categorie.getTrackingId(),
                categorie.getLibelle()
        );
    }
}
