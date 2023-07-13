import java.util.Scanner;

public class OrdenarDosNumerosAssignment {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        Integer num1 = s.nextInt();
        System.out.println("num1 = " + num1);

        System.out.println("Ingrese el segundo numero");
        Integer num2 = s.nextInt();
        System.out.println("num2 = " + num2);

        Integer max = 0;

        max = ( num1 > num2  ? num1 : num2);

        if(max == num1){
            System.out.println( "el orden es: " + max + " y luego: " + num2 );

        }else{
            System.out.println("el orden es: " + num2 + " y luego: " + num1);
        }

    }
}
