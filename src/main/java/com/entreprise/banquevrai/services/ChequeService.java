package com.entreprise.banquevrai.services;




import com.entreprise.banquevrai.DTO.request.AnnulationRequestDto;
import com.entreprise.banquevrai.DTO.request.BeneficiaireRequestDto;
import com.entreprise.banquevrai.DTO.request.ChequeRequestDto;
import com.entreprise.banquevrai.DTO.response.ChequeResponseDto;

import java.util.UUID;

public interface ChequeService {

    ChequeResponseDto creerChequeEtBeneficiaire(ChequeRequestDto chequeDto, BeneficiaireRequestDto beneficiaireDto);

    void confirmerCheque(UUID chequeTrackingId);

    void annulerCheque(UUID chequeTrackingId, AnnulationRequestDto annulationDto);
}
