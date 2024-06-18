package com.entreprise.banquevrai.mappers;

import com.entreprise.banquevrai.DTO.request.ChequeRequestDto;
import com.entreprise.banquevrai.DTO.response.ChequeResponseDto;
import com.entreprise.banquevrai.entities.Cheque;
import org.springframework.stereotype.Component;

@Component
public class ChequeMapper {
    public Cheque toEntity(ChequeRequestDto chequeRequestDto) {
        if (chequeRequestDto == null) {
            return null;
        }

        return Cheque.builder()
                .numero(chequeRequestDto.numero())
                .serie(chequeRequestDto.serie())
                .montant(chequeRequestDto.montant())
                .build();
    }

    public ChequeResponseDto toResponseDTO(Cheque cheque) {
        if (cheque == null) {
            return null;
        }

        return new ChequeResponseDto(
                cheque.getTrackingId(),
                cheque.getNumero(),
                cheque.getSerie(),
                cheque.getMontant(),
                cheque.getDateEdition()


        );
    }

}
