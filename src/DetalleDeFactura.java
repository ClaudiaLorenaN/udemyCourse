import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        String nombreFactura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        nombreFactura = scanner.nextLine();
        //System.out.println("nombreFactura = " + nombreFactura);

        System.out.println("Ingrese el primer número entero");
        double producto1 = 100;

        try{
            producto1 = scanner.nextDouble(); //Integer.parseInt(numeroStr);
        }catch(Exception e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        //System.out.println("producto1 = " + producto1);
        /*String realIntegerStr = String.valueOf(producto1);
        double realDouble = Double.parseDouble(realIntegerStr);
        System.out.println("realDouble = " + realDouble);*/

        System.out.println("Ingrese el segundo número entero");
        double producto2 = 100;
        try{
            producto2 = scanner.nextDouble(); //Integer.parseInt(numeroStr);
        }catch(Exception e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        //System.out.println("producto2 = " + producto2);
        /*String realIntegerStr2 = String.valueOf(producto2);
        double realDouble2 = Double.parseDouble(realIntegerStr2);
        System.out.println("realDouble2 = " + realDouble2);*/

        double totalBruto = producto1 + producto2;
        double impuesto = totalBruto * (0.19);
        double totalNeto = totalBruto + impuesto;

        String resultado = nombreFactura + "\u0020tiene un total bruto de\u0020" + totalBruto + "," + "\u0020con un impuesto de\u0020" + impuesto + "\u0020y el monto despues de impuesto es de\u0020" + totalNeto;
        System.out.println(resultado);

    }


}
