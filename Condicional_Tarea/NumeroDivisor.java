package Condicional_Tarea;

import java.util.Scanner;

public class NumeroDivisor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si uno de dos números es divisor del otro");
        System.out.println("Ingrese un número");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese un número");
        int numero2 = teclado.nextInt();

        boolean divisor2 = (numero2%numero1==0);
        boolean divisor = (numero1%numero2==0);
        if (divisor) {
            System.out.println(numero2 +" es divisor de "+numero1);
        } else {
            if (divisor2) {
                System.out.println(numero1 +" es divisor de "+numero2);
            } else{
                System.out.println("Ninguno de los dos números es divisor del otro.");
            }

        }

        }
    }
