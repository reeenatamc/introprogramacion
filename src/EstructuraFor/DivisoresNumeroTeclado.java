package EstructuraFor;

import java.util.Scanner;

public class DivisoresNumeroTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        for (int contador = 1; contador <= numero; contador++) {

            if (numero%contador==0){
                System.out.println("Los divisores son: "+contador);
            }

        }
    }
}
