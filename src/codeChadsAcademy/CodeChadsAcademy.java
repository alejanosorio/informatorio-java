package codeChadsAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChadsAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- PARTE 1: Cargar primeras 3 notas ---
        int[] notas = new int[5];
        System.out.println("=== CODECHADS ACADEMY ===");
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.println("\nIngrese las primeras 3 notas:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        // --- Calcular las notas 4 y 5 ---
        notas[3] = Funcional.calcularNota4(notas[1]);
        notas[4] = Funcional.calcularNota5(notas[0], notas[2]);

        // --- PARTE 2: Evaluaciones ---
        Funcional.mostrarNotas(notas);
        Funcional.verificarAprobacion(notas);
        Funcional.detectarVariacion(notas);
        Funcional.verificarProgreso(notas);
        Funcional.mostrarOrdenadas(notas);
        Funcional.evaluarNivel(notas, nombre);

        // --- Desafío final ---
        System.out.println("\n\n=== DESAFÍO FINAL: RANKING DE ESTUDIANTES ===");
        Funcional.simularRanking();

        sc.close();
    }
}
