import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 para calcular el area de un triangulo, 2 para calcular el area de una circuferencia o 3 para calcular el area de un cuadrado");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Escribir la base del triangulo");
                double base = teclado.nextDouble();
                System.out.println("Escribir la altura del triangulo");
                double altura = teclado.nextDouble();
                double area = ((base * altura) / 2);
                System.out.println("El area de la cirunferencia es: " + area);
                break;
            case 2:
                System.out.println("Dar el valor del radio: ");
                double radio = teclado.nextDouble();
                double exp = 2;
                double areac = Math.PI * Math.pow(radio, exp);
                System.out.println("El area de la cirunferencia es: " + areac);
                break;
            case 3:
                System.out.println("Escribir la longitud de un lado del cuadrado");
                double lado = teclado.nextDouble();
                double expc = 2;
                double cuadrado = Math.pow(lado, expc);
                break;
            default:
                System.out.println("usted ha ingresado un numero invalido");
        }
    }
}