package com.aluracursos.principal;

import java.util.Map;

public class MonedasAConvertir {

    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public Double getTasaCOP() {
        return conversion_rates.get("COP");
    }
    public Double getTasaARS() {
        return conversion_rates.get("ARS");
    }
    public Double getTasaBOB() {
        return conversion_rates.get("BOB");
    }
    public Double getTasaMXN() {
        return conversion_rates.get("MXN");
    }
    public Double getTasaBRL() {
        return conversion_rates.get("BRL");
    }
    public Double getTasaCLP() {
        return conversion_rates.get("CLP");
    }
    public Double getTasaUYU() {
        return conversion_rates.get("UYU");
    }
    public Double getTasaEUR() {
        return conversion_rates.get("EUR");
    }
    public Double getTasaPEN() {
        return conversion_rates.get("PEN");
    }
    public Double getTasaPYG() {
        return conversion_rates.get("PYG");
    }
}
