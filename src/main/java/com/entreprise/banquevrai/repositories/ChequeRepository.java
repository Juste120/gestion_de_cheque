package com.entreprise.banquevrai.repositories;


import com.entreprise.banquevrai.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChequeRepository extends JpaRepository<Cheque,Long> {
    Cheque findByTrackingId(UUID trackingID);

}
