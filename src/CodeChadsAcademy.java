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



    }
}