package chadQuestRPG;
public class Calculos {

    public static int sumarPuntos(int[] puntos, int cantidad) {
        int total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += puntos[i];
        }
        return total;
    }

    public static int obtenerIndiceMejorMision(int[] puntos) {
        int max = puntos[0];
        int indice = 0;
        for (int i = 1; i < puntos.length; i++) {
            if (puntos[i] > max) {
                max = puntos[i];
                indice = i;
            }
        }
        return indice;
    }

    public static boolean hayMisionFallida(int[] puntos) {
        for (int p : puntos) {
            if (p == 0) return true;
        }
        return false;
    }

    public static boolean esConstante(int[] puntos) {
        int max = puntos[0];
        int min = puntos[0];
        for (int p : puntos) {
            if (p > max) max = p;
            if (p < min) min = p;
        }
        return (max - min) < 20;
    }

    public static int contarSuperioresA(int[] puntos, int limite) {
        int contador = 0;
        for (int p : puntos) {
            if (p > limite) contador++;
        }
        return contador;
    }
}

