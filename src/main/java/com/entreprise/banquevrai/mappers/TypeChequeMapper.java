package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.response.TypeChequeResponseDto;
import com.entreprise.banquevrai.entities.TypeCheque;
import org.springframework.stereotype.Component;

@Component
public class TypeChequeMapper {
    public TypeChequeResponseDto toResponseDTO(TypeCheque typeCheque) {
        if (typeCheque == null) {
            return null;
        }

        return new TypeChequeResponseDto(
                typeCheque.getTrackingId(),
                typeCheque.getLibelle()
        );
    }
}
