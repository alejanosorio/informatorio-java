package codeChadsAcademy;

import java.util.Arrays;

public class CodeChadsAcademy {

    public static void main(String[] args) {

        int nota1 = 80;
        int nota2 = 55;
        int nota3 = 92;
        int nota4, nota5;

        if (nota2 < 60) {
            nota4 = 100;
        } else {
            nota4 = nota2;
        }

        if ((nota1 + nota3) > 150) {
            nota5 = 95;
        } else {
            nota5 = 70;
        }

        int[] notas = {nota1, nota2, nota3, nota4, nota5};

        System.out.println("notas del  alumno: " + Arrays.toString(notas));

        int aprobadas = 0;
        for (int n : notas) {
            if (n >= 60) aprobadas++;
        }

        if (aprobadas == notas.length) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (aprobadas == 0) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }

        boolean success = true;
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i+1] <= notas[i]) {
                success = false;
                break;
            }
        }
        if (success) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] > notas[i]) {
                    int aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
        System.out.println("Notas ordenadas de mayor a menor: " + Arrays.toString(notas));
        boolean progres = true;
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i+1] <= notas[i]) {
                progres = false;
                break;
            }
        }
        if (progres) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
        }



        int total = 0;
        for (int n : notas) total += n;

        if (total < 250) {
            System.out.println("Normie total 😢");
        } else if (total < 350) {
            System.out.println("Soft Chad");
        } else if (total < 450) {
            System.out.println("Chad");
        } else {
            System.out.println("Stone Chad definitivo 💪");
        }
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