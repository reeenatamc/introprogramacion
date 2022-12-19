package Bimestre2.Semana1.Semana2;
import java.util.Scanner;
public class CedulaArregloTarea {

    public static void main(String[] args) {
        System.out.println("ingresar la cedula: ");
        Scanner teclado = new Scanner(System.in);
        String cd = teclado.nextLine();

        int n = 0;
        int suma = 0;
        int res = 0;



        for (int i = 0; i < cd.length(); i++) {
            n = Integer.parseInt(String.valueOf(cd.charAt(i)));
            if (i%2 == 0){
                n = n * 2;
                if (n > 9) {
                    n = n - 9;
                }
            }
            suma = suma + n;
        }
            if (suma %10 !=0){
                res = 10 - (suma%10);
                if (res == n){
                System.out.println(cd+" es correcta.");
            } else {
                System.out.println(cd+" no es correcta.");
            }

        } else {
                System.out.println("cedula correcta");
            }
    }

}
