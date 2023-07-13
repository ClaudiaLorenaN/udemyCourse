public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal== caracter));

        System.out.println("decimal = " + decimal);
        System.out.println("Character.BYTES = " + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("retornoCarro = " + retornoCarro);
        System.out.println("nuevaLinea = " + nuevaLinea + "nueva linea");
        System.out.println("tabulador = " + tabulador + "texto");
        System.out.println("retroceso = " + retroceso + "texto");
        System.out.println("espacio = " + espacio + "texto");



    }

}
