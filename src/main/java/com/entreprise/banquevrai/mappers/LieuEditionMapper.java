package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.response.BeneficiaireResponseDto;
import com.entreprise.banquevrai.DTO.response.LieuEditionResponseDto;
import com.entreprise.banquevrai.entities.Beneficiaire;
import com.entreprise.banquevrai.entities.LieuEdition;
import org.springframework.stereotype.Component;

@Component
public class LieuEditionMapper {
    public LieuEditionResponseDto toResponseDTO(LieuEdition lieuEdition) {
        if (lieuEdition == null) {
            return null;
        }

        return new LieuEditionResponseDto(
                lieuEdition.getTrackingId(),
                lieuEdition.getLibelle(),
                lieuEdition.getEtat()
        );
    }
}
