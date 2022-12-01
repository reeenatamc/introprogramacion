package Proyecto_Final;
import java.util.Scanner;
public class FibonacciAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("programa para determinar n numeros de la secuencia fibonacci + representacion grafica");
        System.out.println("Ingrese la cantidad de numeros que desea generar: ");
        int nf = teclado.nextInt();
        int n1 = 0;
        int n2 = 1;
        String a = "";
        String b = "*";
        String c = "*";
        int contador = 1;
        int x = 1;
        while (x<=nf){
            if (x%2==1){
                System.out.println(n1);
                n1 = n1 + n2;
            } else {
                System.out.println(n2);
                n2 = n2 + n1;
            }
            x = x + 1;
        }
        System.out.println("-----------secuencia asteriscos-----------");
        while (contador <=nf){
            System.out.println(a);
            contador = contador + 1;
            c = a + b;
            a = b;
            b = c;
        }
    }
}
