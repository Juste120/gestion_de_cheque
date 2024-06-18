package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record AnnulationResponseDto(
         UUID trackingId,
         String numero,
         String motif
) {
}
