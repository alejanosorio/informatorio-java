package codeChadsAcademy;
import  java.util.Random;
public class Funcional {

    // ---- PARTE 1 ----
    public static int calcularNota4(int nota2) {
        if (nota2 < 60) return 100;
        return nota2;
    }

    public static int calcularNota5(int nota1, int nota3) {
        if ((nota1 + nota3) > 150) return 95;
        return 70;
    }

    public static void mostrarNotas(int[] notas) {
        System.out.println("\nNotas finales:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Prueba " + (i + 1) + ": " + notas[i]);
        }
    }

    // ---- PARTE 2 ----
    public static void verificarAprobacion(int[] notas) {
        int aprobadas = 0;
        for (int n : notas) {
            if (n >= 60) aprobadas++;
        }

        if (aprobadas == notas.length)
            System.out.println("\nResultado: Aprobaste todas. ¡Backend Sensei!");
        else if (aprobadas == 0)
            System.out.println("\nResultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        else
            System.out.println("\nResultado: Algunas aprobadas. Sos un refactor en progreso.");
    }

    public static void detectarVariacion(int[] notas) {
        int maxVar = 0;
        int pos = 0;

        for (int i = 0; i < notas.length - 1; i++) {
            int dif = Math.abs(notas[i + 1] - notas[i]);
            if (dif > maxVar) {
                maxVar = dif;
                pos = i;
            }
        }

        System.out.println("Mayor salto fue de " + maxVar +
                " puntos entre la prueba " + (pos + 1) + " y la prueba " + (pos + 2) + ".");
    }

    public static void verificarProgreso(int[] notas) {
        boolean progresivo = true;
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i + 1] <= notas[i]) {
                progresivo = false;
                break;
            }
        }
        if (progresivo)
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
    }

    public static void mostrarOrdenadas(int[] notas) {
        int[] copia = notas.clone();

        // Ordenamiento manual (burbuja)
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] < copia[j + 1]) {
                    int aux = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = aux;
                }
            }
        }

        System.out.println("\nNotas ordenadas (mayor a menor):");
        for (int n : copia) System.out.print(n + " ");
        System.out.println();
    }

    public static void evaluarNivel(int[] notas, String nombre) {
        int total = 0;
        for (int n : notas) total += n;

        System.out.println("\nTotal acumulado de " + nombre + ": " + total);

        if (total < 250)
            System.out.println("Nivel: Normie total 😢");
        else if (total < 350)
            System.out.println("Nivel: Soft Chad");
        else if (total < 450)
            System.out.println("Nivel: Chad");
        else
            System.out.println("Nivel: Stone Chad definitivo 💪");
    }

    // ---- DESAFÍO FINAL ----
    public static void simularRanking() {
        Random rand = new Random();
        String[] alumnos = {"Alex", "Bruno", "Carla", "Dana"};
        int[][] notas = new int[alumnos.length][5];

        // Generar notas aleatorias
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < 5; j++) {
                notas[i][j] = 50 + rand.nextInt(51); // entre 50 y 100
            }
        }

        // Mostrar notas
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i] + ": ");
            for (int n : notas[i]) System.out.print(n + " ");
            System.out.println();
        }

        // 1. Promedio más alto
        double mejorProm = 0;
        String mejorAlumno = "";
        for (int i = 0; i < alumnos.length; i++) {
            double prom = promedio(notas[i]);
            if (prom > mejorProm) {
                mejorProm = prom;
                mejorAlumno = alumnos[i];
            }
        }

        // 2. Más regular (menor desviación)
        double menorDesv = Double.MAX_VALUE;
        String masRegular = "";
        for (int i = 0; i < alumnos.length; i++) {
            double desv = desviacion(notas[i]);
            if (desv < menorDesv) {
                menorDesv = desv;
                masRegular = alumnos[i];
            }
        }

        // 3. Peor nota en la tercera prueba
        int peorNota = 101;
        String peorTercera = "";
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i][2] < peorNota) {
                peorNota = notas[i][2];
                peorTercera = alumnos[i];
            }
        }

        System.out.println("\n🏆 Resultados del Ranking:");
        System.out.println("• Mejor promedio: " + mejorAlumno + " (" + mejorProm + ")");
        System.out.println("• Más regular: " + masRegular + " (desviación " + menorDesv + ")");
        System.out.println("• Peor en la tercera prueba: " + peorTercera + " (" + peorNota + ")");
    }

    // Funciones auxiliares para el ranking
    public static double promedio(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum / 5.0;
    }

    public static double desviacion(int[] arr) {
        double prom = promedio(arr);
        double suma = 0;
        for (int n : arr) {
            suma += Math.pow(n - prom, 2);
        }
        return Math.sqrt(suma / arr.length);
    }
}

