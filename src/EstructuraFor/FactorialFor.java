package EstructuraFor;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        int F = 1; //guardar lo del factorial
        for (int contador = 1; contador <= numero; contador++){
            F = F * contador;
        }
        System.out.println("El factorial del numero es: "+F);

    }
}
