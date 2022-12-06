package Bimestre2.Semana1;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para convertir cantidades a otras.");
        int interruptor = 1;
        while (interruptor == 1) {
            System.out.println("Opción 1: convertir Mb a Kb");
            System.out.println("Opción 2: convertir Kb a Mb");
            System.out.println("Opción 3: convertir Mb a bit");
            System.out.println("Opción 4: SALIR");
            int opcion = teclado.nextInt();

            int c_kb = 0;
            int c_mb = 0;
            int c_bit = 0;

            switch (opcion){
                case 1:
                    System.out.println("Ingrese una cantidad: ");
                    int mb = teclado.nextInt();
                    if (mb > 0){
                        c_kb = mb * 1024;
                        System.out.println(mb+" Mb son "+c_kb+" Kb.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese una cantidad: ");
                    int kb = teclado.nextInt();
                    if (kb > 0){
                        c_mb = kb / 1024;
                        System.out.println(kb+" Kb son "+c_mb+" Mb.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese una cantidad: ");
                    int mb_b = teclado.nextInt();
                    if (mb_b > 0){
                        c_bit = (((mb_b * 1024)*1024)*8);
                        System.out.println(mb_b+" Mb son "+c_bit+" bits.");
                    }
                    break;
                case 4:
                    System.out.println("SALIR");
                    interruptor = 0;
            }
        }
    }
}
