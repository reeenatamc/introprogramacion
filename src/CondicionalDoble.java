import java.util.Scanner;
    /**
     * programa pa determinar si una persona es mayor de edad
     */
    public class CondicionalDoble {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Programa pa determinar la mayoría de edad");
            System.out.println("ingrese su edad: ");
            int edad = teclado.nextInt();
            boolean evaluacion = (edad >= 18);
            if (evaluacion) {
                System.out.println("Eres mayor de edad");
                System.out.println("ya casi vas a la u");
            } else {
                System.out.println("aun eres menor de edad");

            }
        }
    }

