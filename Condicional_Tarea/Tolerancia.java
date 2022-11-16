package Condicional_Tarea;

import java.util.Scanner;

public class Tolerancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa que acepte la lectura de tolerancia de un componente y determine la especificación que debería asignarse al componente.");
        System.out.println("Ingrese la tolerancia del componente: ");
        System.out.println("(considere que lo debe hacer sin el signo de porcentaje)");
        double tolerancia = teclado.nextDouble();
        boolean juguete = (tolerancia>=10);
        boolean comercial = (tolerancia>=1) && (tolerancia<10);
        boolean militar = (tolerancia>=0.1) && (tolerancia > 1);
        boolean espacio = (tolerancia>0.1);

        if (juguete){
            System.out.println("Su estado de especificación es grado de juguete.");
        } else if (comercial) {
            System.out.println("Su estado de especificación es grado comercial.");
        } else if (militar) {
            System.out.println("Su estado de especificación es grado militar.");
        } else if (espacio) {
            System.out.println("Su estado de especificación es exploración espacial");
            
        } else {
            System.out.println("Ha ingresado un valor incorrecto.");
    }
}}
