package Bimestre2.Semana1.Semana2;

import java.util.Scanner;

public class BinarioDecimalTarea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //Leemos el num binario en un String

        System.out.print("Introduce un número binario: ");

        String binario = teclado.nextLine();



        //Separamos los bits del binario en un array de int

        int[] bits = new int[binario.length()];



        for (int indice = 0; indice < bits.length; indice++)

            bits[indice] = Character.getNumericValue(binario.charAt(indice));



        //Ya tenemos los bits en un array de int,

        //ahora hay que calcular su valor decimal



        int exponente  = 0; //Exponente para la base 2, que irá incrementándose

        int valorDecimal = 0; //Aqui acumulamos el valor de cada bit que sumados nos dan el valor decimal



        for (int i = bits.length - 1; i >= 0; i--) { //Recorremos el array a la inversa, de fin a principio

            if (bits[i] == 1) //Es un 1, acumulamos la potencia de 2 correspondiente

                valorDecimal += Math.pow(2, exponente);



            exponente++; //Incrementamos exponente para la próxima cifra

        }



        System.out.println("\nValor decimal: " + valorDecimal);

    }
}
