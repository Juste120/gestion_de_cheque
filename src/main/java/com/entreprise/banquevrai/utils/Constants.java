package com.entreprise.banquevrai.utils;

public class Constants{
    public static final String API_VERSION = "/v1";
    public static final String BASE_URL = "/api" + API_VERSION;

    public static final class ChequePaths {
        public static final String CHEQUES = BASE_URL + "/cheques";
        public static final String CREER_CHEQUE = CHEQUES;
        public static final String CONFIRMER_CHEQUE = CHEQUES + "/{trackingId}/confirmer";
        public static final String ANNULER_CHEQUE = CHEQUES + "/{trackingId}/annuler";
    }

    public static final class BeneficiairePaths {
        public static final String BENEFICIAIRES = BASE_URL + "/beneficiaires";
        public static final String CREER_BENEFICIAIRE = BENEFICIAIRES;
    }
}
