package chadQuestRPG;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

    public static void guardarResultados(String nombre, int[] puntos, int total) {
        try (PrintWriter out = new PrintWriter(new FileWriter("resultado_" + nombre + ".txt"))) {

            out.println("===== RESULTADOS DE " + nombre + " =====");
            out.println("Total de puntos: " + total);
            out.println();

            int acumulado = 0;
            out.println("Misión | Puntos | Puntos Acumulados");
            out.println("------------------------------------");
            for (int i = 0; i < puntos.length; i++) {
                acumulado += puntos[i];
                out.printf("%6d | %6d | %17d%n", (i + 1), puntos[i], acumulado);
            }

            out.println("------------------------------------");
            out.println("TOTAL FINAL: " + total);
            out.println("====================================");

            System.out.println("\n✅ Resultados guardados en el archivo: resultado_" + nombre + ".txt");

        } catch (IOException e) {
            System.out.println("⚠️ Error al guardar el archivo: " + e.getMessage());
        }
    }
}

