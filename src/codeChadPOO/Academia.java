package codeChadPOO;

import java.util.*;

import java.util.*;

public class Academia {
    private List<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public Alumno mejorPromedio() {
        Alumno mejor = alumnos.getFirst ();
        for (Alumno a : alumnos) {
            if (a.promedio() > mejor.promedio()) mejor = a;
        }
        return mejor;
    }

    public Alumno masRegular() {
        Alumno regular = alumnos.getFirst ();
        int menorDesv = desviacion(regular);

        for (Alumno a : alumnos) {
            int desv = desviacion(a);
            if (desv < menorDesv) {
                menorDesv = desv;
                regular = a;
            }
        }
        return regular;
    }

    private int desviacion(Alumno a) {
        int max = a.getNotas()[0], min = a.getNotas()[0];
        for (int n : a.getNotas()) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        return max - min;
    }

    public Alumno peorEnTercera() {
        Alumno peor = alumnos.getFirst ();
        for (Alumno a : alumnos) {
            if (a.getNotas()[2] < peor.getNotas()[2]) peor = a;
        }
        return peor;
    }

    public void mostrarRanking() {
        System.out.println("\n🏆 Ranking CodeChads Academy");
        System.out.println("Mejor promedio: " + mejorPromedio().getNombre());
        System.out.println("Más regular: " + masRegular().getNombre());
        System.out.println("Peor en la tercera prueba: " + peorEnTercera().getNombre());
    }
}
