package codeChadPOO;

public class Alumno {
    private String nombre;
    private int[] notas = new int[5];

    public Alumno(String nombre, int n1, int n2, int n3) {
        this.nombre = nombre;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        calcularNotasRestantes();
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getNotas() {
        return notas;
    }


    public void calcularNotasRestantes() {
        // Nota 4
        notas[3] = (notas[1] < 60) ? 100 : notas[1];
        // Nota 5
        notas[4] = ((notas[0] + notas[2]) > 150) ? 95 : 70;
    }

    public double promedio() {
        return total() / 5.0;
    }

    public int total() {
        int suma = 0;
        for (int n : notas) suma += n;
        return suma;
    }

    public int aprobadas() {
        int count = 0;
        for (int n : notas) if (n >= 60) count++;
        return count;
    }

    public String mayorSalto() {
        int max = 0, idx = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            int diff = Math.abs(notas[i+1] - notas[i]);
            if (diff > max) {
                max = diff;
                idx = i;
            }
        }
        return "Mayor salto fue de " + max + " puntos entre prueba " + (idx+1) + " y " + (idx+2);
    }

    public boolean esProgresivo() {
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i+1] <= notas[i]) return false;
        }
        return true;
    }


    public int[] ordenarNotas() {
        int[] copia = new int[notas.length];
        for (int i = 0; i < notas.length; i++) copia[i] = notas[i];

        for (int i = 0; i < copia.length; i++) {
            for (int j = i+1; j < copia.length; j++) {
                if (copia[j] > copia[i]) {
                    int aux = copia[i];
                    copia[i] = copia[j];
                    copia[j] = aux;
                }
            }
        }
        return copia;
    }

    public String nivelFinal() {
        int total = total();
        if (total < 250) return "Normie total 😢";
        if (total < 350) return "Soft Chad";
        if (total < 450) return "Chad";
        return "Stone Chad definitivo 💪";
    }

    public void mostrarResumen() {
        System.out.println("\n👨‍💻 Alumno: " + nombre);
        System.out.print("Notas: ");
        for (int n : notas) System.out.print(n + " ");
        System.out.println("\nPromedio: " + promedio());
        System.out.println(mayorSalto());
        System.out.println("Progresivo: " + (esProgresivo() ? "Sí 📈" : "No"));
        System.out.println("Nivel: " + nivelFinal());
    }
}

