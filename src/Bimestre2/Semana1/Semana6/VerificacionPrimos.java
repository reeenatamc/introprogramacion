package Bimestre2.Semana1.Semana6;

/**
 * programa para verificar a traves de metodos si un numero es primo
 * y si par o impar
 */
public class VerificacionPrimos {
    int n1;
    int cont_divisores = 0;

    public boolean verificar_primo(int num_a_verificar) {
        for (int cont = 1; cont <= num_a_verificar; cont++) {
            if (num_a_verificar % cont == 0) //detectamos un nuevo divisor
                cont_divisores++;
        }
        if (cont_divisores == 2)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        VerificacionPrimos mivariable = new VerificacionPrimos();
        mivariable.verificar_primo(5);
    }
}
