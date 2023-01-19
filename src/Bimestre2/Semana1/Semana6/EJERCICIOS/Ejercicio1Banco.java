package Bimestre2.Semana1.Semana6.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1Banco {
    static double s_i = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Saldo inicial: ");
        s_i = teclado.nextDouble(); 

        int opcion = 0;

            boolean interruptor = true;
            while (interruptor){
                System.out.println("1. Consulta de saldo");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir.");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        consultaSaldo(); 
                        break;
                    case 2:
                        retirarDinero(); 
                        break;
                    case 3:
                        depositarDinero(); 
                        break;
                    case 4:
                     
                        interruptor = false;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            }


        }


    public static void consultaSaldo() {
        System.out.println("Saldo actual: $" + s_i);
    }

    public static void retirarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a retirar: $");
        double r = teclado.nextDouble();
        if (r > s_i) {
            System.out.println("Saldo insuficiente para realizar esta operación.");
        } else {
            s_i = s_i - r; //Se resta la cantidad retirada al saldo actual
            System.out.println("Dinero retirado exitosamente. Nuevo saldo: $" + s_i);
        }
    }

    public static void depositarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a depositar: $");
        double d = teclado.nextDouble();
        s_i = s_i +d;
        System.out.println("Dinero depositado exitosamente. Nuevo saldo: $" + s_i);
    }
}

