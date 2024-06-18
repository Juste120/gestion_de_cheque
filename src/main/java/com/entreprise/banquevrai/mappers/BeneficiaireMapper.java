package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.request.BeneficiaireRequestDto;
import com.entreprise.banquevrai.DTO.response.BeneficiaireResponseDto;
import com.entreprise.banquevrai.entities.Beneficiaire;
import com.entreprise.banquevrai.repositories.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BeneficiaireMapper {

    private CategorieRepository categorieRepository;

    public Beneficiaire toEntity(BeneficiaireRequestDto beneficiaireRequestDto) {
        if (beneficiaireRequestDto == null) {
            return null;
        }

        return Beneficiaire.builder()
                .nom(beneficiaireRequestDto.nom())
                .contact(beneficiaireRequestDto.contact())
                .build();
    }

    public BeneficiaireResponseDto toResponseDTO(Beneficiaire beneficiaire) {
        if (beneficiaire == null) {
            return null;
        }

        return new BeneficiaireResponseDto(
                beneficiaire.getTrackingId(),
                beneficiaire.getNom(),
                beneficiaire.getContact()
        );
    }

}
