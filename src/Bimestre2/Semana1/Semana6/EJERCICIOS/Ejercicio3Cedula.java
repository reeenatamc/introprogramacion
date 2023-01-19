package Bimestre2.Semana1.Semana6.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio3Cedula {
    public static boolean validarCedula(String cedula) {
        // Verificar que tenga 10 dígitos
        if (cedula.length() != 10) {
            return false;
        }

        int suma = 0;
        for (int i = 0; i < cedula.length() - 1; i++) {
            int digito = Integer.parseInt(cedula.substring(i, i + 1));
            if (i % 2 == 0) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }
            suma = suma + digito;
        }
        int ultimoDigito = Integer.parseInt(cedula.substring(9, 10));
        int verificador = 10 - (suma % 10);
        if (verificador == 10) {
            verificador = 0;
        }
        return ultimoDigito == verificador;
    }

    public static void validarCedulas (String[][] cedulas) {
        for (int indice = 0; indice < cedulas.length; indice++) {
            for (int indice2 = 0; indice2 < cedulas[0].length; indice2++) {
                if (validarCedula(cedulas[indice][indice2])){
                    System.out.println("La cedula "+cedulas[indice][indice2]+ " es valida.");
                }else {
                    System.out.println("La cedula " + cedulas [indice][indice2]+ " no es valida.");
                }

            }

        }

    }

    public static void main(String[] args) {
        String[][] cedulas = new String[5][1];
        Scanner teclado = new Scanner(System.in);
        for (int indice = 0; indice < cedulas.length; indice++) {
            System.out.println("Ingrese el numero de cedula: ");
            cedulas[indice][0] = teclado.nextLine();
        }
        validarCedulas(cedulas);
    }
}

