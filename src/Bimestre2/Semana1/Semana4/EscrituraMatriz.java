package Bimestre2.Semana1.Semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        int numeros [][] = new int [3][2];
        int filas = numeros.length;
        int columnas = numeros[1].length;
        numeros[1][1]=5;
        // operacion escritura de una matriz
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.println("Ingrese una edad["+fila+"]["+col+"]: ");
                int edad = teclado.nextInt();
                numeros [fila][col] = edad;

            }
            System.out.print("\n");


        }
        // operacion lectura de una matriz
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.print(numeros[fila][col] + "\t");

            }
            System.out.print("\n");

        }
    }
}
