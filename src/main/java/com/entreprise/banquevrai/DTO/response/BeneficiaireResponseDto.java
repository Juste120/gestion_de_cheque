package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record BeneficiaireResponseDto(
         UUID trackingId,
         String nom,
         String contact
) {
}
