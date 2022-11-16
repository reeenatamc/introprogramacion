package Condicional_Tarea;

import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si un triangulo es rectángulo dados sus tres lados");
        System.out.println("Ingrese el lado o cateto a");
        double lado1 = teclado.nextDouble();
        System.out.println("Ingrese el lado o cateto b");
        double lado2 = teclado.nextDouble();
        System.out.println("Ingrese la hipotenusa");
        double hipo = teclado.nextDouble();

        boolean triangulo = (((lado1*lado1)+( lado2*lado2))==( hipo*  hipo));
        if (triangulo) {
            System.out.println("Efectivamente, es un triángulo rectángulo.");
        } else {
            System.out.println("No es un triángulo rectángulo.");
        }
    }
}
