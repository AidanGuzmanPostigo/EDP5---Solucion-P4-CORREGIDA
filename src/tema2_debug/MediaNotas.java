package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int numAlumnos = pedirNum(sc, "Introduce el número de alumnos: ", "No has introducido un valor correcto");
        double suma = sumaNotas(sc, contador, numAlumnos);
        double media = calculoMedia(suma, numAlumnos);
        System.out.printf("La media del grupo es: %.2f", media);
        sc.close();
    }
    private static int pedirNum(Scanner sc, String ms, String error) {
    	int numAlumnos = 0;
    	do {
        	System.out.print(ms);
        	numAlumnos = sc.nextInt();
        	if (numAlumnos < 1) {
        		System.out.println(error);
        	}
        } while (numAlumnos < 1);
    	return numAlumnos;
    }
    private static double sumaNotas(Scanner sc, int contador, int numAlumnos) {
    	double suma = 0;
    	while (contador <= numAlumnos) {
            System.out.print("Introduce la nota del alumno " + contador + ": ");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10");
        	} else {
        		suma = suma + nota;
        		contador++;
        	}
        }
    	return suma;
    }
    private static double calculoMedia(double suma, int numAlumnos) {
    	double media = suma / numAlumnos;
    	return media;
    }
}
