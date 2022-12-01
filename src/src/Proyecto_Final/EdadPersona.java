package Proyecto_Final;
import java.util.Scanner;
public class EdadPersona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar la edad de una persona");
        System.out.println("Ingrese su año de nacimiento: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int m = teclado.nextInt();
        System.out.println("Ingrese su día de nacimiento: ");
        int d = teclado.nextInt();
        System.out.println("Ingrese su hora de nacimiento: ");
        int h = teclado.nextInt();

        System.out.println("Ingrese el año actual: ");
        int a2 = teclado.nextInt();
        System.out.println("Ingrese el mes actual: ");
        int m2 = teclado.nextInt();
        System.out.println("Ingrese el día actual: ");
        int d2 = teclado.nextInt();
        System.out.println("Ingrese la hora actual: ");
        int h2 = teclado.nextInt();

        int edad_meses = 0;
        int edad_anos = 0;
        int edad_dias = 0;
        int edad_hora = 0;

        boolean a1 = (a >= 1930 && a<=2022);
        boolean ac_actual = (a2==2022);
        boolean mcondicion = (m>=1&&m<=12 && m2 >=1&& m2<=12);

        int contador = 1;

        //condicion
        while (contador == 1) {
            if (mcondicion && a1 && ac_actual) {
                switch (m) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (d >= 1 && d <= 31 && d2 >= 1 && d2 <= 31) {
                            edad_anos = a2 - a;
                            edad_dias = d2 - d;
                            edad_hora = h2 - h;
                            edad_meses = m2 - m;
                            System.out.println("La fecha es correcta.");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (d >= 1 && d <= 30 && d2 >= 1 && d2 <= 30) {
                            edad_anos = a2 - a;
                            edad_dias = d2 - d;
                            edad_hora = h2 - h;
                            edad_meses = d2 - d;
                            System.out.println("La fecha es correcta.");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                    case 2:
                        if ((a % 4 == 0 && a % 100 != 0 || a % 400 == 0)) {
                            if (d >= 1 && d <= 29) {
                                edad_anos = a2 - a;
                                edad_dias = d2 - d;
                                edad_hora = h2 - h;
                                edad_meses = d2 - d;
                                System.out.println("La fecha es correcta.");
                            } else {
                                System.out.println("Fecha incorrecta");
                            }
                        } else if (d >= 1 && d <= 28) {
                            edad_anos = a2 - a;
                            edad_dias = d2 - d;
                            edad_hora = h2 - h;
                            edad_meses = d2 - d;
                            System.out.println("La fecha es correcta.");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                }
                System.out.println ("Tienes "+ edad_anos+ " anos, "+edad_meses+" meses, "+edad_dias+" dias y "+edad_hora+" horas.");
            } else {
                System.out.println("Fecha incorrecta");
            }
            contador = contador + 1;
        }

    }
}
