package com.entreprise.banquevrai.DTO.response;

import java.util.Date;
import java.util.UUID;

public record ChequeResponseDto(
         UUID trackingId,
         String numero,
         String serie,
         double montant,
         Date dateEdition
) {
}
