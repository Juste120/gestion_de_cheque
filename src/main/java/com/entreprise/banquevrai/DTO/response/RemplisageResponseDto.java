package com.entreprise.banquevrai.DTO.response;

import lombok.Builder;

import java.util.Date;
import java.util.UUID;

@Builder
public record RemplisageResponseDto(
         UUID trackingId,
         String reference,
         Date date,
         String user
) {
}
