package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CategorieResponseDto(
         UUID trackingId,
         String libelle
) {
}
