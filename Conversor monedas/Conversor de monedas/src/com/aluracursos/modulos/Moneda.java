package com.aluracursos.modulos;

import com.aluracursos.principal.MonedasAConvertir;

import java.util.Scanner;

public class Moneda {

         public void menuLat (MonedasAConvertir menu) {

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                        + "\n"
                        +  "$ Tasa de conversión por dólar $ \n"
                        + "\n"
                        + " * 1) Tasa de cambio para Colombia (COP): " + menu.getTasaCOP() + "\n"
                        + " * 2) Tasa de cambio para Argentina (ARS): " + menu.getTasaARS() + "\n"
                        + " * 3) Tasa de cambio para Brasil (BRL): " + menu.getTasaBRL() + "\n"
                        + " * 4) Tasa de cambio para Chile (CLP): " + menu.getTasaCLP() + "\n"
                        + " * 5) Tasa de cambio para Bolivia (BOB): " + menu.getTasaBOB() + "\n"
                        + " * 6) Tasa de cambio para México (MXN): " + menu.getTasaMXN() + "\n"
                        + " * 7) Tasa de cambio para Uruguay (UYU): " + menu.getTasaUYU() + "\n"
                        + " * 8) Tasa de cambio para Perú (PEN): " + menu.getTasaPEN() + "\n"
                        + " * 9) Tasa de cambio para Paraguay (PYG): " + menu.getTasaPYG() + "\n"
                        + " * 10) Tasa de cambio Euro (EUR): " + menu.getTasaEUR() + "\n"

                        + "\n"
                        + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                        + " "
                );
         };
};


