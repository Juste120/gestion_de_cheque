package com.entreprise.banquevrai.mappers;


import com.entreprise.banquevrai.DTO.response.MotifResponseDto;
import com.entreprise.banquevrai.DTO.response.RemplisageResponseDto;
import com.entreprise.banquevrai.entities.Motif;
import com.entreprise.banquevrai.entities.Remplissage;
import org.springframework.stereotype.Component;

@Component
public class MotifMapper {
    public MotifResponseDto toResponseDTO(Motif motif) {
        if (motif == null) {
            return null;
        }

        return new MotifResponseDto(
                motif.getTrackingId(),
                motif.getLibelle()

        );
    }
}
