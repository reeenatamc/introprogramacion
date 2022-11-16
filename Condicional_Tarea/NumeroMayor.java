package Condicional_Tarea;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si un número es mayor a otro");
        System.out.println("Ingresar número a");
        double numa = teclado.nextDouble();
        System.out.println("Ingresar número b");
        double numb = teclado.nextDouble();
        boolean mayor = (numa>numb);
        boolean menor = (numb>numa);
        if (mayor){
            System.out.println("El primer número es mayor.");
        } if (menor){
            System.out.println("El primer número es menor.");
        } else {
            System.out.println("Usted ha ingresado números iguales o un caracter extraño.");
    }
}}
