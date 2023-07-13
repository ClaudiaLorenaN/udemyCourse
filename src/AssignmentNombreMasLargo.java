import javax.swing.*;

public class AssignmentNombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null,
                "Ingrese nombre y apellido del primer familiar");
        String nombre2 = JOptionPane.showInputDialog(null,
                "Ingrese nombre y apellido del segundo familiar");
        String nombre3 = JOptionPane.showInputDialog(null,
                "Ingrese nombre y apellido del tercer familiar");

        String [] splitNombre1 = nombre1.split(" ");
        String [] splitNombre2 = nombre2.split(" ");
        String [] splitNombre3 = nombre3.split(" ");

        String masLargo = "";

        masLargo = (splitNombre1[0].length() + splitNombre1[1].length() >
                splitNombre2[0].length() + splitNombre2[1].length()) ? nombre1 : masLargo;
        masLargo = (splitNombre2[0].length() + splitNombre2[1].length() >
                splitNombre1[0].length() + splitNombre1[1].length()) ? nombre2 : masLargo;
        masLargo = (splitNombre3[0].length() + splitNombre3[1].length() >
                splitNombre1[0].length() + splitNombre1[1].length()) ? nombre3 : masLargo;


        System.out.println("El nombre mas largo es = " + masLargo);

    }
}
