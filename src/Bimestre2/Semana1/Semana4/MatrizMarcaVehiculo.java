package Bimestre2.Semana1.Semana4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *MATRIZ CON VALORES RECIBIDOS DESDE EL TECLADO Y LUEGO PODER REALIZAR OPERACIONES
 * 1. busqueda
 * 2. modificacion
 * eliminacion
 * visualizacion
 * salida
 */

public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();
        teclado.nextLine();
        String marcas[][] = new String[filas][columnas]; // DIMENSION DE LA MATRIZ CONT TECLADOO
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int columna1 = 0; columna1 < columnas; columna1++) {
                System.out.println("ingrese valor para posicion [" + fila1 + "][" + columna1 + "]");
                marcas[fila1][columna1] = teclado.nextLine();
            }
        }
        boolean salir = false;
        while (!salir) {
            System.out.println("Digite 1 pa realizar una busqueda: ");
            System.out.println("Digite 2 pa modificar un valor: ");
            System.out.println("Digite 3 pa eliminar un valor: ");
            System.out.println("Digite 4 pa visualizar la matriz: ");
            System.out.println("Digite 5 pa SALIR: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch ((opcion)) {//salir == false
                case 1:
                    System.out.println("HAS SELECCIONADO OPERACION BUSQUEDA");
                    System.out.println("q marca busca?: ");
                    String marca_buscada = teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int columna = 0; columna < columnas; columna++) {
                            if (marcas[fila][columna].equals(marca_buscada)) {
                                System.out.println("Si se encontro la marca: " + marca_buscada);
                                System.out.println("En la posicion: [" + fila + "][" + columna + "]");
                                encontrado = true;
                                break;
                            }

                        }

                    }
                    if (encontrado == false)
                        System.out.println("MARCA NO ENCONTRADA");
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO OPERACION DE MODIFICACION");
                    System.out.println("INGRESE EL NUMERO DE FILA Q DESEA MODIFICAR: ");
                    int fila1 = teclado.nextInt();
                    System.out.println("INGRESE EL NUMERO DE CLOUMNA Q DESEA MODIFICAR: ");
                    int columna1 = teclado.nextInt();
                    System.out.println("Cual es la nueva marca ha ingresar");
                    String nueva_marca = teclado.nextLine().toLowerCase();
                    marcas[fila1][columna1] = nueva_marca;
                    break;
                case 3:
                    System.out.println("HAS SELECCIONADO OPERACION ELIMINACION");
                    System.out.println("Q marca va eliminar?: ");
                    String eliminada = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int columna = 0; columna < columnas; columna++) {
                            if (marcas[fila][columna].equals(eliminada)){

                            }

                        }

                    }
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO OPERACION LECTURA");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int columna = 0; columna < columnas; columna++) {

                        }
                    }
                    break;
                case 5:
                    System.out.println("chao sapx");
                    break;
                default:
                    System.out.println("doxxeado");
                    }
            }
        }
    }
