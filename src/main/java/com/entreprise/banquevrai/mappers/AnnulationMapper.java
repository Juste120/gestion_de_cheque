package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.request.AnnulationRequestDto;
import com.entreprise.banquevrai.DTO.request.BeneficiaireRequestDto;
import com.entreprise.banquevrai.DTO.response.BeneficiaireResponseDto;
import com.entreprise.banquevrai.entities.Annulation;
import com.entreprise.banquevrai.entities.Beneficiaire;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AnnulationMapper {
    public Annulation toEntity(AnnulationRequestDto annulationRequestDto) {
        if (annulationRequestDto == null) {
            return null;
        }

        return Annulation.builder()
                .numero(annulationRequestDto.numero())
                .motif(annulationRequestDto.motif())
                .build();
    }

    public AnnulationRequestDto toResponseDTO(Annulation annulation) {
        if (annulation == null) {
            return null;
        }

        return new AnnulationRequestDto(
                annulation.getTrackingId(),
                annulation.getNumero(),
                annulation.getMotif()
        );
    }

}
