package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.response.BanqueResponseDto;
import com.entreprise.banquevrai.entities.Banque;
import org.springframework.stereotype.Component;

@Component
public class BanqueMapper {
    public BanqueResponseDto toResponseDTO(Banque banque) {
        if (banque == null) {
            return null;
        }

        return new BanqueResponseDto(
                banque.getTrackingId(),
                banque.getCode(),
                banque.getLibelle()
        );
    }
}
