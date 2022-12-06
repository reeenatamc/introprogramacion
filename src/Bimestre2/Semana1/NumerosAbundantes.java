package Bimestre2.Semana1;

import java.util.Scanner;

public class NumerosAbundantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si un número es abundante o no");
        System.out.println("Ingrese un número: ");
        int nabu = teclado.nextInt();
        int contador = 1;
        int abundante = 0;
        while (contador < nabu) {
            if (nabu%contador==0){
                abundante = abundante + contador;
            }
            contador = contador + 1;
        }
        if (abundante > nabu) {
            System.out.println("Es un número abundante.");
        } else {
            System.out.println("No es un número abundante.");
        }
    }
}
