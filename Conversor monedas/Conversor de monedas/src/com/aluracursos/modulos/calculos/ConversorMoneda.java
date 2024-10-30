package com.aluracursos.modulos.calculos;

import com.aluracursos.modulos.Busqueda;
import com.aluracursos.principal.MonedasAConvertir;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversorMoneda extends MonedasAConvertir {

    List<String> historialDeConversiones = new ArrayList<>();
    Busqueda consultaAPI = new Busqueda();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    MonedasAConvertir conversion = gson.fromJson(consultaAPI.busquedaApi(), MonedasAConvertir.class);

    public List<String> getHistorialDeConversiones() {
        return historialDeConversiones;
    }

    public void conversionLat(int inputInicial, Double inputConversion) {

        Double resultado;

        switch (inputInicial) {
            case 1:
                resultado = inputConversion / conversion.getTasaCOP();
                DecimalFormat resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " pesos colombianos son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *\n" +
                        " ");
                historialDeConversiones.add("* $ " + inputConversion + " pesos colombianos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 2:
                resultado = inputConversion / conversion.getTasaARS();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " pesos argentinos son " + resultadoConvertido.format(resultado)
                        + " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " pesos argentinos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 3:
                resultado = inputConversion / conversion.getTasaBRL();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " reales de brasil son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " reales de brasil son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 4:
                resultado = inputConversion / conversion.getTasaCLP();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " pesos chilenos son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " pesos chilenos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 5:
                resultado = inputConversion / conversion.getTasaBOB();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " Bolivianos son " + resultadoConvertido.format(resultado)
                        + " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " Bolivianos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 6:
                resultado = inputConversion / conversion.getTasaMXN();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " pesos mexicanos son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " pesos mexicanos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 7:
                resultado = inputConversion / conversion.getTasaUYU();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " pesos uruguayos son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " pesos uruguayos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 8:
                resultado = inputConversion / conversion.getTasaPEN();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " soles peruanos son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " soles peruanos son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 9:
                resultado = inputConversion / conversion.getTasaPYG();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " Guaranís son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " Guaranís son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
            case 10:
                resultado = inputConversion / conversion.getTasaEUR();
                resultadoConvertido = new DecimalFormat("#.2");
                System.out.println("\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                        "\n" +
                        "* $ " + inputConversion + " Euros son " + resultadoConvertido.format(resultado) +
                        " dólares estadounidenses *");
                historialDeConversiones.add("* $ " + inputConversion + " Euros son " +
                        resultadoConvertido.format(resultado) + " dólares estadounidenses *");
                break;
        };
    };

        public void conversionUsd (int inputInicial, Double inputConversion ){

            Busqueda consultaAPI = new Busqueda();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            MonedasAConvertir conversion = gson.fromJson(consultaAPI.busquedaApi(), MonedasAConvertir.class);

            Double resultado;

            switch (inputInicial) {
                case 1:
                    resultado = inputConversion * conversion.getTasaCOP();
                    DecimalFormat resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " pesos colombianos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " pesos colombianos *");
                    break;
                case 2:
                    resultado = inputConversion * conversion.getTasaARS();
                    resultadoConvertido = new DecimalFormat("#.1");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado)
                            + " pesos argentinos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " pesos argentinos *");
                    break;
                case 3:
                    resultado = inputConversion * conversion.getTasaBRL();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " reales de brasil *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " reales de brasil *");
                    break;
                case 4:
                    resultado = inputConversion * conversion.getTasaCLP();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " pesos chilenos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " pesos chilenos *");
                    break;
                case 5:
                    resultado = inputConversion * conversion.getTasaBOB();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado)
                            + " Bolivianos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " Bolivianos *");
                    break;
                case 6:
                    resultado = inputConversion * conversion.getTasaMXN();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " pesos mexicanos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son "
                            + resultadoConvertido.format(resultado) + " pesos mexicanos *");
                    break;
                case 7:
                    resultado = inputConversion * conversion.getTasaUYU();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " pesos uruguayos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son " +
                            resultadoConvertido.format(resultado) + " pesos uruguayos *");
                    break;
                case 8:
                    resultado = inputConversion * conversion.getTasaPEN();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses son " + resultadoConvertido.format(resultado) +
                            " soles peruanos *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses son " +
                            resultadoConvertido.format(resultado) + " soles peruanos *");
                    break;
                case 9:
                    resultado = inputConversion * conversion.getTasaPYG();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses " + resultadoConvertido.format(resultado) +
                            " Guaranís *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses " +
                            resultadoConvertido.format(resultado) + " Guaranís *");
                    break;
                case 10:
                    resultado = inputConversion * conversion.getTasaEUR();
                    resultadoConvertido = new DecimalFormat("#.2");
                    System.out.println("\n" +
                            "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                            "\n" +
                            "* $ " + inputConversion + " dólares estadounidenses " + resultadoConvertido.format(resultado) +
                            " Euros *");
                    historialDeConversiones.add("* $ " + inputConversion + " dólares estadounidenses " +
                            resultadoConvertido.format(resultado) + " Euros son *");
                    break;
            };
        };
    };

