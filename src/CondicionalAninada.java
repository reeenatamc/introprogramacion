import java.util.Scanner;

public class CondicionalAninada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa pa determinar la mayoría de edad");
        System.out.println("ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad > 0 && edad <= 150) {
            {
                System.out.println("eres menor de edad");
                System.out.println("no vas a la u");
            } if (edad > 0 && edad < 18) {
                System.out.println("eres menor de edad");
            } else if (edad >= 65 && edad <= 100) {
                System.out.println("eres de la tercera edad");
            } else if (edad > 100 && edad <= 150) {
                System.out.println("estás viejo");
            }else
                System.out.println("ERRORRRRRRRRR");
        }

    }
}
