package com.entreprise.banquevrai.DTO.request;

import lombok.Builder;


@Builder
public record AnnulationRequestDto(
        java.util.UUID trackingId,
        String numero,
        String motif
) {
}
