package Bimestre2.Semana1.Semana6.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio2Triangulos {
    public static String Triangulo(double a, double b, double h){
        if (h*h == a*a + b*b){
            return "Es un triangulo rectangulo";
        } else if (h*h < a*a + b*b){
            return "Es un triangulo acutangulo";
        } else if (h*h > a*a + b*b){
            return "Es un triangulo obtusangulo";
        }
        return ".";
        }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor del primer cateto: ");
        double a = teclado.nextDouble();
        System.out.println("Valor del segundo cateto: ");
        double b = teclado.nextDouble();
        System.out.println("Valor de la hipotenusa: ");
        double h = teclado.nextDouble();
        System.out.println(Triangulo(a, b, h));
    }
}

