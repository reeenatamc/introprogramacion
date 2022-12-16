package Bimestre2.Semana1.Semana2;

import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("ingresar el tamanio de la suma: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        int arr1 [];
        int arr2 [];

        arr1 = new int[num];
        arr2 = new int [num];

        int subtotal = 0;

        int total = 0;

        System.out.println("Ingrese la primera serie: ");
        for (int indice = 0; indice < num ; indice++) {
            int num1 = teclado.nextInt();
            arr1[indice] = num1;
        }

        System.out.println("Ingrese la segunda serie: ");
        for (int indice = 0; indice < num ; indice++) {
            int num2 = teclado.nextInt();
            arr2[indice] = num2;
        }
        int suma [] = new int [num];
        for (int indice = 0; indice < num ; indice++) {
            suma[indice] = arr1[indice]+arr2[indice];
        }
        for (int indice = 0; indice < num; indice++) {
            System.out.println(suma[indice]);
        }

    }
}
