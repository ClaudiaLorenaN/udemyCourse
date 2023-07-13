import java.util.Scanner;

public class AssignmentNombreFamiliares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int numeroFamiliares = 3;
        String nombreFamiliar1;
        String nombreFamiliar2;
        String nombreFamiliar3;

        String final1 = "";
        String final2 = "";
        String final3 = "";

        for(int i=0; i < numeroFamiliares; i++){
            System.out.println("Ingrese el nombre del familiar");

            if (i==0){
                nombreFamiliar1 = scanner.nextLine();
                System.out.println("nombreFamiliar1 = " + nombreFamiliar1);
                char[] arregloNombreFamiliar1 = nombreFamiliar1.toCharArray();

                String segundoCaracterName1= String.valueOf(arregloNombreFamiliar1[1]);

                String segundoCaracterMayuscula = segundoCaracterName1.toUpperCase();
                System.out.println("segundoCaracterMayuscula = " + segundoCaracterMayuscula);

                final1 =  segundoCaracterMayuscula + "."+ nombreFamiliar1.substring(nombreFamiliar1.length()-2);


            }
            if (i==1){
                nombreFamiliar2 = scanner.nextLine();
                System.out.println("nombreFamiliar = " + nombreFamiliar2);
                char[] arregloNombreFamiliar2 = nombreFamiliar2.toCharArray();
                String segundoCaracterName2= String.valueOf(arregloNombreFamiliar2[1]);
                String segundoCaracterMayuscula = segundoCaracterName2.toUpperCase();
                System.out.println("segundoCaracterMayuscula = " + segundoCaracterMayuscula);

                final2 = segundoCaracterMayuscula + "."+nombreFamiliar2.substring(nombreFamiliar2.length()-2);
            }
            if (i==2){
                nombreFamiliar3 = scanner.nextLine();
                System.out.println("nombreFamiliar = " + nombreFamiliar3);
                char[] arregloNombreFamiliar3 = nombreFamiliar3.toCharArray();
                String segundoCaracterName3= String.valueOf(arregloNombreFamiliar3[1]);
                String segundoCaracterMayuscula = segundoCaracterName3.toUpperCase();
                System.out.println("segundoCaracterMayuscula = " + segundoCaracterMayuscula);

                final3 = segundoCaracterMayuscula + "." + nombreFamiliar3.substring(nombreFamiliar3.length()-2);
            }
        }
        String resultadoFinal = final1 + "_" + final2 + "_" + final3;

        System.out.println(resultadoFinal);*/
        System.out.println("Digite el nombre de un familiar" );
        String nombreA = scanner.nextLine();
        String nombreA1 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Digite el nombre de otro familiar");
        String nombreB = scanner.nextLine();
        String nombreB1 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Digite el nombre de otro familiar" );
        String nombreC = scanner.nextLine();
        String nombreC1 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        System.out.println(nombreA1 + "_" + nombreB1 + "_" + nombreC1);
    }


}
