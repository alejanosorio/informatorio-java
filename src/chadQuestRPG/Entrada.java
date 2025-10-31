package chadQuestRPG;

import java.util.Scanner;

public class Entrada {

    public static void cargarMisiones(Scanner sc, int[] puntos, int cantidad) {
        System.out.println("\n--- Ingreso de puntos (primeras " + cantidad + " misiones) ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese puntos de la misión " + (i + 1) + ": ");
            puntos[i] = sc.nextInt();
        }
    }

    public static void cargarMisiones(Scanner sc, int[] puntos, int inicio, int fin) {
        System.out.println("\n--- Ingreso de puntos restantes ---");
        for (int i = inicio; i < fin; i++) {
            System.out.print("Ingrese puntos de la misión " + (i + 1) + ": ");
            puntos[i] = sc.nextInt();
        }
    }
}

