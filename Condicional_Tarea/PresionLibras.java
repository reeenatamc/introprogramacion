package Condicional_Tarea;

import java.util.Scanner;

public class PresionLibras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Programa para determinar el valor de la presión en libras por pulgada cuadrada");
        System.out.println("Ingresar el valor del tiempo en segundos: ");
        int t = teclado.nextInt();
        boolean segundos = (t<=35);
        boolean segundos1 = (t>35);
        double psi=0.46*t;

        if (segundos){
            psi = 0.46*t;
            System.out.println("Correcto, la presión es: "+psi);
        } else if (segundos1) {
            psi=(0.19*t)+9.45;
            System.out.println("Bien, la presión es: "+psi);
        }else{
            System.out.println("Algo ha ocurrido, por favor inténtelo de nuevo.");
        }

    }
}
