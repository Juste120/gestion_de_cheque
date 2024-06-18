package com.entreprise.banquevrai.controllers;



import com.entreprise.banquevrai.DTO.request.AnnulationRequestDto;
import com.entreprise.banquevrai.DTO.request.BeneficiaireRequestDto;
import com.entreprise.banquevrai.DTO.request.ChequeRequestDto;
import com.entreprise.banquevrai.DTO.response.ChequeResponseDto;
import com.entreprise.banquevrai.services.ChequeService;
import com.entreprise.banquevrai.utils.Constants;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.ChequePaths.CHEQUES)
@AllArgsConstructor
public class ChequeController {

    private final ChequeService chequeService;

    @PostMapping
    public ResponseEntity<ChequeResponseDto> creerChequeEtBeneficiaire(
            @RequestBody ChequeRequestDto chequeDto,
            @RequestBody BeneficiaireRequestDto beneficiaireDto
    ) {
        ChequeResponseDto response = chequeService.creerChequeEtBeneficiaire(chequeDto, beneficiaireDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(Constants.ChequePaths.CONFIRMER_CHEQUE)
    public ResponseEntity<?> confirmerCheque(@PathVariable UUID trackingId) {
        chequeService.confirmerCheque(trackingId);
        return ResponseEntity.ok("Chèque confirmé avec succès");
    }

    @PutMapping("/{trackingId}/annuler")
    public ResponseEntity<?> annulerCheque(@PathVariable UUID trackingId, @RequestBody AnnulationRequestDto annulationDto) {
        chequeService.annulerCheque(trackingId, annulationDto);
        return ResponseEntity.ok("Chèque annulé avec succès");
    }
}
