import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultBinary = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultBinary);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultHex);
        
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n"+ resultHex;

        JOptionPane.showMessageDialog(null, message);


    }
}
