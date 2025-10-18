package codeChadPOO;

public class Main {
    public static void main(String[] args) {
        Academia codeChads = new Academia();

        Alumno alumno1 = new Alumno("alex", 80, 55, 90);
        Alumno alumno2 = new Alumno("pepe", 75, 65, 60);
        Alumno alumno3 = new Alumno("carlo", 100, 85, 90);
        Alumno alumno4 = new Alumno("antonio", 50, 40, 30);

        codeChads.agregarAlumno(alumno1);
        codeChads.agregarAlumno(alumno2);
        codeChads.agregarAlumno(alumno3);
        codeChads.agregarAlumno(alumno4);

        alumno1.mostrarResumen();
        alumno2.mostrarResumen();
        alumno3.mostrarResumen();
        alumno4.mostrarResumen();

        codeChads.mostrarRanking();
    }
}

