import java.util.Scanner;

public class AssignmentEstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resultado = "";

        System.out.println("Por favor ingresar medida actual del estanque");
        double medidaActual = s.nextDouble();


        resultado = (medidaActual == 70) ? "Estanque lleno" : resultado;
        resultado = (medidaActual <70 && medidaActual >=60) ? "Estanque casi lleno" : resultado;
        resultado = (medidaActual <60 && medidaActual >=40) ? "Estanque 3/4" : resultado;
        resultado = (medidaActual <40 && medidaActual >=35) ? "Medio estanque" : resultado;
        resultado = (medidaActual <35 && medidaActual >=20) ? "Suficiente" : resultado;
        resultado = (medidaActual <20 && medidaActual >=1) ? "Insuficiente" : resultado ;

        System.out.println("resultado = " + resultado);


    }
}
