public class Simulador {
    public static void main(String[] args) {
        int[] puntosPorMision = new int[5];
        int total = 0;


        puntosPorMision[0] = 50; // misión 1
        puntosPorMision[1] = 80; // misión 2
        puntosPorMision[2] = 60; // misión 3
        puntosPorMision[3] = 90; // misión 4
        puntosPorMision[4] = 40; // misión 5


        for (int i = 0; i < puntosPorMision.length; i++) {
            total += puntosPorMision[i];
        }


        if (total > 300) {
            System.out.println("¡Felicidades! Sos un verdadero Chad del RPG 🎯");
        } else {
            System.out.println("Te falta entrenamiento, joven aprendiz...");
        }


        int maxPuntos = puntosPorMision[0];
        int misionMax = 1;
        for (int i = 1; i < puntosPorMision.length; i++) {
            if (puntosPorMision[i] > maxPuntos) {
                maxPuntos = puntosPorMision[i];
                misionMax = i + 1;
            }
        }
        System.out.println("Tu mejor desempeño fue en la misión " + misionMax + " con " + maxPuntos + " puntos.");


        boolean fallo = false;
        for (int puntos : puntosPorMision) {
            if (puntos == 0) {
                fallo = true;
                break;
            }
        }
        if (fallo) {
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }

        int minPuntos = puntosPorMision[0];
        for (int puntos : puntosPorMision) {
            if (puntos < minPuntos) {
                minPuntos = puntos;
            }
        }
        if ((maxPuntos - minPuntos) < 20) {
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
        }


        int contadorChad = 0;
        for (int puntos : puntosPorMision) {
            if (puntos > 75) {
                contadorChad++;
            }
        }
        if (contadorChad >= 3) {
            System.out.println("Nivel desbloqueado: Mini Stone Chad");
        }


        System.out.println("\n=== Tabla de Puntuación Final ===");
        System.out.printf("%-10s %-10s %-15s\n", "Misión", "Puntos", "Acumulado");
        int acumulado = 0;
        for (int i = 0; i < puntosPorMision.length; i++) {
            acumulado += puntosPorMision[i];
            System.out.printf("%-10d %-10d %-15d\n", (i + 1), puntosPorMision[i], acumulado);
        }
        System.out.println("----------------------------------");
        System.out.println("TOTAL FINAL: " + total);

    }
}
