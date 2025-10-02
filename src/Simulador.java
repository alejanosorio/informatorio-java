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

        int[][] clase = {
                {40, 65, 90, 100, 95},
                {70, 65, 60, 65, 70},
                {100, 95, 90, 75, 95},
                {50, 50, 30, 100, 70}
        };

        double mejorProm = 0;
        int proMejor = 0;

        double menorDesv = Double.MAX_VALUE;
        int masRegular = 0;

        int peorTercera = Integer.MAX_VALUE;
        int peor = 0;

        for (int i = 0; i < clase.length; i++) {
            int suma = 0;
            for (int n : clase[i]) suma += n;
            double prom = suma / 5.0;

            if (prom > mejorProm) {
                mejorProm = prom;
                proMejor = i;
            }

            // Desviación (diferencia máx - min)
            int max = clase[i][0], min = clase[i][0];
            for (int n : clase[i]) {
                if (n > max) max = n;
                if (n < min) min = n;
            }
            int desv = max - min;
            if (desv < menorDesv) {
                menorDesv = desv;
                masRegular= i;
            }

            // Peor en tercera
            if (clase[i][2] < peorTercera) {
                peorTercera = clase[i][2];
                peor = i;
            }
        }

        System.out.println("Mejor promedio: Estudiante " + (proMejor+1));
        System.out.println("Más regular: Estudiante " + (masRegular+1));
        System.out.println("Peor en la tercera prueba: Estudiante " + (peor+1));
    }
}




