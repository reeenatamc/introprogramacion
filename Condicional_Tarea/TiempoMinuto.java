package Condicional_Tarea;

import java.util.Scanner;

public class TiempoMinuto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para convertir el tiempo en minutos a su equivalencia en días, horas y minutos");
        System.out.println("Ingresar el tiempo en minutos ");
        int tiempo = teclado.nextInt();
        int dia = 0;
        int hora = 0;
        int min = 0;
        while (tiempo > 0) {
            if (tiempo >= 1140) {
               dia = (dia+1);
               tiempo = (tiempo - 1140);
            } else if (tiempo >= 60){
                hora = (hora+1);
                tiempo = (tiempo - 60);
            } else {
                min = (min + 1);
                tiempo = (tiempo - 1);
                
            }
        }
        System.out.println("Es igual a " + dia + " dias, " +hora+" horas y " + min +" minutos.");
    }
}
