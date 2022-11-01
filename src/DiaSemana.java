import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("Programa para determinar que dia de la semana es");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int dia1 = teclado.nextInt();

        if (dia1 == 1)
            System.out.println("Es lunes");
        else if (dia1 == 2)
            System.out.println("Es martes");
        else if (dia1 == 3)
            System.out.println("Es miercoles");
        else if (dia1 == 4)
            System.out.println("Es jueves");
        else if (dia1 == 5)
            System.out.println("Es viernes");
        else if (dia1 == 6)
            System.out.println("Es sabado");
        else if (dia1 == 7)
            System.out.println("Es viernes");
        else
            System.out.println("Erroooor");

        }
    }