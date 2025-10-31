package chadQuestRPG;

import java.util.Scanner;

public class ChadQuestRPG {

    static final int CANT_MISIONES = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntos = new int[CANT_MISIONES];

        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        // 1. Cargar primeras 3 misiones
        Entrada.cargarMisiones(sc, puntos, 3);
        int totalParcial = Calculos.sumarPuntos(puntos, 3);
        System.out.println("Puntos acumulados hasta ahora: " + totalParcial);

        // 2. Cargar las restantes
        Entrada.cargarMisiones(sc, puntos, 3, CANT_MISIONES);

        // 3. Calcular y mostrar resultados finales
        int totalFinal = Calculos.sumarPuntos(puntos, CANT_MISIONES);
        Reportes.mostrarResultados(nombre, puntos, totalFinal);

        // 4. Guardar en archivo
        Archivo.guardarResultados(nombre, puntos, totalFinal);

        sc.close();
    }
}

