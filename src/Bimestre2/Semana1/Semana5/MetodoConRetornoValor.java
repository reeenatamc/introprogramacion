package Bimestre2.Semana1.Semana5;

import java.util.Scanner;

public class MetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para sumar 2 numeros");
        System.out.println("Ingrese el primer num");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo num");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2);
        System.out.println("La suma es: "+resultado);
        //sumar_dos_nums(num1, num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado, 2);
        System.out.println("El promedio de los numeros es "+promedio);
    }

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }
    public static void sumar_dos_nums(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("la suma es "+ resultado);
    }

    /**
     * metodo obtener el promedio de valores
     * @param suma_total
     * @param cantidad_numeros
     * @return
     */
    public static double obtener_promedio(int suma_total, int cantidad_numeros){
        double promedio = (double)suma_total/(double)cantidad_numeros;
        return promedio;
    }
}
