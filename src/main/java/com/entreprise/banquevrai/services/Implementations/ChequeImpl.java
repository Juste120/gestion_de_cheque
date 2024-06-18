package com.entreprise.banquevrai.services.Implementations;

import com.entreprise.banquevrai.DTO.request.AnnulationRequestDto;
import com.entreprise.banquevrai.DTO.request.BeneficiaireRequestDto;
import com.entreprise.banquevrai.DTO.request.ChequeRequestDto;
import com.entreprise.banquevrai.DTO.response.ChequeResponseDto;
import com.entreprise.banquevrai.entities.Annulation;
import com.entreprise.banquevrai.entities.Beneficiaire;
import com.entreprise.banquevrai.entities.Cheque;
import com.entreprise.banquevrai.exceptions.ChequeNotFoundException;
import com.entreprise.banquevrai.mappers.AnnulationMapper;
import com.entreprise.banquevrai.mappers.BeneficiaireMapper;
import com.entreprise.banquevrai.mappers.ChequeMapper;
import com.entreprise.banquevrai.repositories.AnnulationRepository;
import com.entreprise.banquevrai.repositories.BeneficiaireRepository;
import com.entreprise.banquevrai.repositories.ChequeRepository;
import com.entreprise.banquevrai.services.ChequeService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class ChequeImpl implements ChequeService {

    private final ChequeRepository chequeRepository;
    private final ChequeMapper chequeMapper;
    private final BeneficiaireRepository beneficiaireRepository;
    private final BeneficiaireMapper beneficiaireMapper;
    private final AnnulationRepository annulationRepository;
    private final AnnulationMapper annulationMapper;

    private UUID generateTrackingId() {
        return UUID.randomUUID();
    }


    @Override
    public ChequeResponseDto creerChequeEtBeneficiaire(ChequeRequestDto chequeDto, BeneficiaireRequestDto beneficiaireDto) {
        Beneficiaire beneficiaire = beneficiaireMapper.toEntity(beneficiaireDto);
        beneficiaire.setTrackingId(generateTrackingId());
        beneficiaire = beneficiaireRepository.save(beneficiaire);

        Cheque cheque = chequeMapper.toEntity(chequeDto);
        cheque.setTrackingId(generateTrackingId());
        cheque.setBeneficiaire(beneficiaire);
        cheque.setStatut("NON_CONFIRME");
        return chequeMapper.toResponseDTO(chequeRepository.save(cheque));
    }

    @Override
    public void confirmerCheque(UUID chequeTrackingId) {
        Optional<Cheque> optionalCheque = Optional.ofNullable(chequeRepository.findByTrackingId(chequeTrackingId)); // Obtenez un Optional<Cheque>

        Cheque cheque = optionalCheque.orElseThrow(() -> new ChequeNotFoundException("Chèque introuvable avec trackingId: " + chequeTrackingId));

        if (!cheque.getStatut().equals("NON_CONFIRME")) {
            throw new IllegalStateException("Le chèque ne peut pas être confirmé. Statut actuel : " + cheque.getStatut());
        }
        cheque.setStatut("CONFIRME");
        chequeRepository.save(cheque);
    }

    @Override
    public void annulerCheque(UUID chequeTrackingId, AnnulationRequestDto annulationDto) {
        Optional<Cheque> optionalCheque = Optional.ofNullable(chequeRepository.findByTrackingId(chequeTrackingId)); // Obtenez un Optional<Cheque>

        Cheque cheque = optionalCheque.orElseThrow(() -> new ChequeNotFoundException("Chèque introuvable avec trackingId: " + chequeTrackingId));

        if (!cheque.getStatut().equals("NON_CONFIRME")) {
            throw new IllegalStateException("Le chèque ne peut pas être annulé. Statut actuel : " + cheque.getStatut());
        }

        Annulation annulation = annulationMapper.toEntity(annulationDto);
        annulation.setTrackingId(generateTrackingId());
        annulation.setCheque(cheque);
        annulationRepository.save(annulation);
        cheque.setStatut("ANNULE");
        chequeRepository.save(cheque);
    }
}
