package Bimestre2.Semana1.Semana2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * programa q solicite el nombre n marcas de vehiculos y las almacene en un arreglo
 * finalmente el programa debe mostrar el nombre de las marcas almacenadas en el arregloooooooooooo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("cuantas marcas desea ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n];
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca " + (indice + 1));
            String marca = teclado.nextLine();
            marcas[indice] = marca;
        }
        System.out.println("lista de marcas ingresadas: ");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice] + "\t");
        }
        //OPERACION DE BUSQUEDA
        System.out.println("Que nombre de marca desea buscar?");
        String marca_busqueda = teclado.nextLine().toUpperCase();
        for (int indice = 0; indice < marcas.length; indice++) {
            if (marca_busqueda.equals (marcas[indice].toUpperCase())){
                System.out.println("Marca encontrada");
                System.out.println("se encuentra en el indice "+indice);
                break;

            }
        }
    }
}
