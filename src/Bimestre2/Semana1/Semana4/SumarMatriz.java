package Bimestre2.Semana1.Semana4;

public class SumarMatriz {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,3,8},
                {3,7,9}
        };
        int b [][] = {
                {1,4,6},
                {5,3,9},
                {1,7,6}
        };
        int filas = a.length;
        int cols = a[0].length;
        int c [][] = new int[filas][cols];
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                int suma = a[fila][col] + b [fila][col];
                c[fila][col] = suma;
            }

        }
        //mostrar los elementos de la matriz c
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < cols ; col++) {
                //System.out.print(numeros[fila][col] + "\t");
                System.out.print(c[fila][col] + "\t");

            }
            System.out.print("\n");

        }
    }
}
