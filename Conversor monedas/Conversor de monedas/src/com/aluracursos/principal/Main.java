package com.aluracursos.principal;

import com.aluracursos.modulos.Busqueda;
import com.aluracursos.modulos.GuardardoArchivo;
import com.aluracursos.modulos.Moneda;
import com.aluracursos.modulos.calculos.ConversorMoneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner lecturaTeclado = new Scanner(System.in);
        Moneda menu = new Moneda();
        GuardardoArchivo creadorJsonFinal = new GuardardoArchivo();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ConversorMoneda conversorMoneda = new ConversorMoneda();
        Busqueda consultaAPI = new Busqueda();
        MonedasAConvertir monedasAConvertir = gson.fromJson(consultaAPI.busquedaApi(), MonedasAConvertir.class);
        int inputInicial;

        System.out.println("""
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                                   ¡¡ Bienvenido al conversor de monedas !!
                """);

        while (true) {

            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                    "\n" +
                    "Ingresa el número 11 para convertir a dólar estadounidense, el número 12\n"
                    + "para convertir de dólar a otra moneda, o 13 para salir:\n" +
                    "\n" +
                    "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            try {
                inputInicial = lecturaTeclado.nextInt();
                while (inputInicial < 11 || inputInicial > 13) {
                    System.out.println("Numero invalido, por favor digita alguno de los números indicados:");
                    inputInicial = lecturaTeclado.nextInt();
                    if (inputInicial == 13) {
                        break;
                    }
                }

                if (inputInicial == 13) {
                    break;
                } else if (inputInicial == 11) {

                    while (inputInicial != 15) {
                        menu.menuLat(monedasAConvertir);
                        System.out.println("Ingresa el número de la moneda que deseas convertir:\n" +
                                "\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        inputInicial = lecturaTeclado.nextInt();

                        while (inputInicial < 1 || inputInicial > 10) {
                            System.out.println("Numero invalido, por favor digita alguno de los números indicados");
                            inputInicial = lecturaTeclado.nextInt();
                        }

                        System.out.println("Ingresa el valor que deseas convertir a dólar estadounidense:\n" +
                                "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
                        double inputConversion = lecturaTeclado.nextDouble();
                        conversorMoneda.conversionLat(inputInicial, inputConversion);
                        System.out.println("\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                                "\n" +
                                "Ingresa el número 14 para seleccionar una moneda " +
                                "o 15 para salir a la ventana inicial\n" +
                                "\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        inputInicial = lecturaTeclado.nextInt();

                        while (inputInicial < 14 || inputInicial > 15) {
                            System.out.println("Numero invalido, por favor digita alguno de los números indicados");
                            inputInicial = lecturaTeclado.nextInt();
                        }
                    }
                } else if (inputInicial == 12) {

                    while (inputInicial != 15) {
                        menu.menuLat(monedasAConvertir);
                        System.out.println("Ingresa el número de la moneda a la cual deseas realizar la conversión:\n" +
                                "\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        inputInicial = lecturaTeclado.nextInt();

                        while (inputInicial < 1 || inputInicial > 10) {
                            System.out.println("Numero invalido, por favor digita alguno de los números indicados");
                            inputInicial = lecturaTeclado.nextInt();
                        }

                        System.out.println("Ingresa el valor que deseas convertir a la moneda seleccionada:\n" +
                                "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
                        double inputConversion = lecturaTeclado.nextDouble();
                        conversorMoneda.conversionUsd(inputInicial, inputConversion);
                        System.out.println("\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                                "\n" +
                                "Ingresa el número 14 para seleccionar una moneda " +
                                "o 15 para salir a la ventana inicial\n" +
                                "\n" +
                                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        inputInicial = lecturaTeclado.nextInt();
                        while (inputInicial < 14 || inputInicial > 15) {
                            System.out.println("Numero invalido, por favor digita alguno de los números indicados");
                            inputInicial = lecturaTeclado.nextInt();
                        }
                    }
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Dato invalido, por favor digita un número acorde al menú indicado:");
                break;
            };
        };
        System.out.println("""
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                Historial de conversiones:
                """);

        for (String valorMoneda : conversorMoneda.getHistorialDeConversiones()) {
            System.out.println(valorMoneda);
        }
        ;

        System.out.println("""
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                // Exportando historial a formato .JSON.....
                
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                                    !!!! Gracias por utilizar nuestros servicios !!!!
                """);

        creadorJsonFinal.escritorArchivo(conversorMoneda.getHistorialDeConversiones());
    };
};







