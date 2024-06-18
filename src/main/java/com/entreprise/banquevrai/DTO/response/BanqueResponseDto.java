package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record BanqueResponseDto(
         UUID trackingId,
         String code,
         String libelle
) {
}
