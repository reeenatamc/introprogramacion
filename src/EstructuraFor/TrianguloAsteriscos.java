package EstructuraFor;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();
        for (int fila = 1; fila <= filas; fila++ ){ //comenzar con la variable y controlar el numero de filas
            String fila_asteriscos = "";
            for (int col = 1; col <= fila ; col++) {
                fila_asteriscos = fila_asteriscos + "*";
            }
            System.out.println(fila_asteriscos);
        }
    }
}
