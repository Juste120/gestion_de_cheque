package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record TypeChequeResponseDto(
         UUID trackingId,
         String libelle
) {
}
