public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("Prueba de operadores lógicos o booleanos");
        boolean valor = (5==5);
        boolean valor_logico = ((5==5) || (4>=3 ) );
        boolean valor_logico_and = ((5==5) && (4>=3 ) );
        System.out.println( valor );
        System.out.println("valor: "+valor);
        System.out.println("valor_logico: "+valor_logico);
        System.out.println("valor_logico_and: "+valor_logico_and);
        System.out.println("negación de valor_logico: "+!valor_logico);
    }
}
