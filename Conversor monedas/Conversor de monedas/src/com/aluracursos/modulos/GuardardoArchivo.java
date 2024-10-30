package com.aluracursos.modulos;

import com.aluracursos.modulos.calculos.ConversorMoneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardardoArchivo {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ConversorMoneda lista = new ConversorMoneda();

    public void escritorArchivo (List historialDeConversiones) throws IOException {

        Map<String, List<String>> tituloJson = new HashMap<>();
        tituloJson.put("Historial de conversiones", historialDeConversiones);

        try (FileWriter writer = new FileWriter("historialDeConversiones.json")) {
            gson.toJson(tituloJson, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    };
}
