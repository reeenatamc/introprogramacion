package Bimestre2.Semana1.Semana4;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        char letras[][] = {
                {'a', 'b', 'c'},{'d','e','f'}
        };//dimension 2x3
        char trans [][] = new char [letras[0].length][letras.length];
        for (int fila = 0; fila < letras[0].length; fila++) {
            for (int columna = 0; columna < letras.length; columna++) {
                trans[fila][columna] = letras[columna][fila];
                System.out.print(trans[fila][columna]+ "\t");
            }
            System.out.print("\n");

        }
    }
}
