package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.response.RemplisageResponseDto;
import com.entreprise.banquevrai.entities.Remplissage;
import org.springframework.stereotype.Component;

@Component
public class RemplissageMapper {
    public RemplisageResponseDto toResponseDTO(Remplissage remplissage) {
        if (remplissage == null) {
            return null;
        }

        return new RemplisageResponseDto(
                remplissage.getTrackingId(),
                remplissage.getReference(),
                remplissage.getDate(),
                remplissage.getUser()

        );
    }
}
