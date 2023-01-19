package Bimestre2.Semana1.Semana5;

public class MetodoSinRetornoValor {
    public static void main(String[] args) {
        //CREAR UNA NUEVA VARUABLE A PARTIR DE NUESTRA CLASE
        //MetodoSinRetornoValor llamada = new MetodoSinRetornoValor();
        //llamada.saludar();
        //saludar();
        saludar_con_nombre("renata");
    }
    public static void saludar() {
        System.out.println("BIENVENIDO A LA CREACI[ON DE M[ETODOOS");
        System.out.println("creado en java");
    }

    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENIDE "+nombre.toUpperCase()+" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");


    }
}
