package Bimestre2.Semana1.Semana4;

public class Matriz {
    public static void main(String[] args) {
        int matriz [][] = new int[2][3];
        System.out.println(matriz[1][2]);
        //dcreacion de una matriz con valores predefinidos
        String univ [][] = {
                {"utpl", "ucuenca", "espol"},
                {"unl", "uazuay", "ulda"}
        };
        System.out.println("dimension de la matriz: ");
        System.out.println("filas = " + univ.length);
        System.out.println("columnas = " + univ[0].length);

        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                System.out.println(univ[fila][col] + "\t");
            }
            System.out.println("\n");

        }
        //System.out.println(univ[1][2]);
    }
}
