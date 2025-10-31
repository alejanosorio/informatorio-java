package chadQuestRPG;

public class Reportes {

    public static void mostrarResultados(String nombre, int[] puntos, int total) {
        System.out.println("\n===== RESULTADOS FINALES =====");
        System.out.println("Jugador: " + nombre);
        System.out.println("Total de puntos: " + total);

        if (total > 300) {
            System.out.println("🎯 ¡Felicidades! Sos un verdadero Chad del RPG 🎯");
        } else {
            System.out.println("Te falta entrenamiento, joven aprendiz...");
        }

        int mejor = Calculos.obtenerIndiceMejorMision(puntos);
        System.out.println("Tu mejor desempeño fue en la misión " +
                (mejor + 1) + " con " + puntos[mejor] + " puntos.");

        if (Calculos.hayMisionFallida(puntos)) {
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }

        if (Calculos.esConstante(puntos)) {
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
        }

        if (Calculos.contarSuperioresA(puntos, 75) >= 3) {
            System.out.println("Nivel desbloqueado: Mini Stone Chad 🗿");
        }

        mostrarTablaFinal(puntos, total);
    }

    public static void mostrarTablaFinal(int[] puntos, int total) {
        System.out.println("\n===== TABLA DE PUNTUACIÓN FINAL =====");
        System.out.println("Misión | Puntos | Puntos Acumulados");
        System.out.println("------------------------------------");

        int acumulado = 0;
        for (int i = 0; i < puntos.length; i++) {
            acumulado += puntos[i];
            System.out.printf("%6d | %6d | %17d%n", (i + 1), puntos[i], acumulado);
        }

        System.out.println("------------------------------------");
        System.out.println("TOTAL FINAL: " + total);
        System.out.println("====================================");
    }
}

