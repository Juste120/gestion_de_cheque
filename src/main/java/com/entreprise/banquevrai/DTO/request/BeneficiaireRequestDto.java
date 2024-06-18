package com.entreprise.banquevrai.DTO.request;

import lombok.Builder;

@Builder
public record BeneficiaireRequestDto(
         String nom,
         String contact
) {
}
