package Condicional_Tarea;

import java.util.Scanner;

public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si una fecha es correcta (1990 a 2010)");
        System.out.println("Ingrese un año: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese un mes: ");
        int m = teclado.nextInt();
        System.out.println("Ingrese un día: ");
        int d = teclado.nextInt();

        boolean a1 = (a>=1990)&&(a<=2010);
        boolean m2 = (m>=1)&&(m<=12);

        if (m2 && a1){
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: if (d >= 1 && d <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                } break;
                case 4:
                case 6:
                case 9:
                case 11: if (d >= 1 && d <= 30) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                } break;
                case 2: if (( a % 4 == 0 && a % 100 != 0 || a % 400 == 0 )) {
                    if (d>=1 && d<=29) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                } else if(d>=1 && d<=28) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                } break;
            }}else {
            System.out.println("Fecha incorrecta");}
    }}
