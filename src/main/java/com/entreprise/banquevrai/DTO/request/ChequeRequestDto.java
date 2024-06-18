package com.entreprise.banquevrai.DTO.request;

import com.entreprise.banquevrai.DTO.response.*;
import lombok.Builder;

@Builder
public record ChequeRequestDto(
        String numero,
        String serie,
        double montant

) {
}
