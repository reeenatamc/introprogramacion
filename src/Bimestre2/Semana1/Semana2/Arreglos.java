package Bimestre2.Semana1.Semana2;

public class Arreglos {
    public static void main(String[] args) {
        // creacion de arreglos predefinidos
        String universidades [] = {"utpl", "unl", "espol","ucuenca"};
        int tam = universidades.length; //obtener el tamanio del arreglo
        System.out.println("tamanio del arreglo: "+ tam);
        for (int indice = 0; indice < tam ; indice++){
            System.out.println( universidades[indice] );
        }
        System.out.println("\n");
        //creacion arreglo tipo entero
        int notas [] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length; indice++){
            System.out.println(notas[indice]);
        }
        System.out.println("\n");
        //creacion de un arreglo tipo char
        char vocales [] = {'a', 'e', 'i','o', 'u'};
        for (int indice = 0; indice < vocales.length; indice++) {
        System.out.println(vocales[indice]);
        }
        System.out.println("\n");
        //creacion de arreglo tipo booleano
        boolean valores [] = {true, false, false, true, true};
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice]);
        }
    }
}
