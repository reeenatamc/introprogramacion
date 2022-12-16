package Bimestre2.Semana1.Semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si una palabra es de tipo palindromo.");
        System.out.println("ingrese una palabra: ");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine().toLowerCase();
        int tam_palabra = palabra.length();
        System.out.println("tam_palabra = "+tam_palabra);
        char palabra_arr [] = new char [tam_palabra];
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice] = palabra.charAt(indice);
        }

        String palabra_invertida = "";
        for (int indice = tam_palabra-1; indice >= 0 ; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }

        if (palabra.equals(palabra_invertida)) {
            System.out.println("Si es.");
        } else {
            System.out.println("No es.");
        }
    }
}
