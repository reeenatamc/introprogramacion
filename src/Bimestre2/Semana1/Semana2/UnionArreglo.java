package Bimestre2.Semana1.Semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 [] = {"hp", "dell", "asus", "lenovo", "toshiba"};
        String marcas2 [] = {"samsung", "huawei", "dere"};
        int tam_arr_resultado = marcas1.length+ marcas2.length;
        String res[] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length ; indice++) {
            res[indice] = (marcas1[indice]);
        }
        for (int indice = marcas1.length, indice2=0; indice < res.length; indice++, indice2++) {
            res[indice] = (marcas2[indice2]);
        }
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }

    }
}
