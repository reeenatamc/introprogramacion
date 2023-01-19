package Bimestre2.Semana1.Semana5;

import java.util.Scanner;

public class AREAFIGURA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para obtener areas");
        System.out.println("DIGITE 1. AREA CIRCUNFERENCIA DIGITE 2. AREA CUADRADO DIGITE 3. AREA CILINDRO");
        int opcion = teclado.nextInt();

    }
    public void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner(System.in);

        switch (opcion) {

            case 1:
                System.out.println("ESCOGISTE EL AREA DE UNA CIRCUNFEREMCIA");
                System.out.println("Ingrese el valor del radio: ");
                int radio = teclado.nextInt();
                double area = circulo(radio);

            case 2:
                System.out.println("ESCOGISTE EL AREA DE UN CUADRADO");
                System.out.println("Ingrese el valor de un lado del cuadrado: ");
                int lado = teclado.nextInt();
                double area1 = cuadrado(lado);
            case 3:
                System.out.println("ESCOGISTE EL AREA DE UN CILINDRO");
                System.out.println("Ingrese el valor del radio: ");
                int radio1 = teclado.nextInt();
                System.out.println("Ingrese el valor del radio: ");
                int altura = teclado.nextInt();
                double area2 = cilindro(altura, radio1);
            default:
                System.out.println("Por favor ingrese un numero valido");
        }
    }

    /**
     *
     * @param radio
     * @return
     */
        public double circulo(double radio){
            double area_c = Math.PI * Math.pow(radio, 2);
            return area_c;
        }

    /**
     *
     * @param lado
     * @return
     */
    public double cuadrado(double lado){
            double area_cua = lado * lado;
            return area_cua;
    }

    /**
     *
     * @param altura
     * @param radio1
     * @return
     */
    public double cilindro (double altura, double radio1){
        double area_cilin = 2 * Math.PI*radio1*(radio1+altura);
        return area_cilin;
    }

}

