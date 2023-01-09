package Bimestre2.Semana1.Semana4;

import java.util.Scanner;

public class MULTIPLICARMATRICES {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();
        teclado.nextLine();
        int a[][] = new int[filas][columnas]; // DIMENSION DE LA MATRIZ CONT TECLADOO
        int b[][] = new int[filas][columnas];

        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int columna1 = 0; columna1 < columnas; columna1++) {
                System.out.println("ingrese valor para posicion [" + fila1 + "][" + columna1 + "]");
                a[fila1][columna1] = teclado.nextInt();
            }
        }
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int columna1 = 0; columna1 < columnas; columna1++) {
                System.out.println("ingrese valor para posicion [" + fila1 + "][" + columna1 + "]");
                b[fila1][columna1] = teclado.nextInt();
            }
        }


        int c [][] = new int[filas][columnas];
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int columna1 = 0; columna1 < columnas; columna1++) {
                int mult = a[fila1][columna1]*b[fila1][columna1];
                c[fila1][columna1] = mult;
            }

        }
        //mostrar a
        System.out.println("MATRIZ A");
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.print(a[fila][col] + "\t");
            }
            System.out.print("\n");
        }
        // mostrar b
        System.out.println("MATRIZ B");
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.print(b[fila][col] + "\t");

            }
            System.out.print("\n");
        }
        System.out.println("MATRIZ RESULTANTE C");
        //mostrar los elementos de la matriz c
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.print(c[fila][col] + "\t");

            }
            System.out.print("\n");
        }
    }
}
