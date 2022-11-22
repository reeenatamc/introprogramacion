package EstructuraFor;

import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero limite: ");
        int limite = teclado.nextInt();
        int suma_impares = 0;
        for(int contador = 1; contador <= limite; contador+=2){

                suma_impares = suma_impares + contador;

        }
        System.out.println("La suma de numeros impares = "+suma_impares);
    }
}
