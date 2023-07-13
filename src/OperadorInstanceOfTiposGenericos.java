public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

        Number num =  Integer.valueOf(7); // 7

        Boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);
        ///

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo double = " + b1);


        Number decimal = Float.valueOf(45.54f); // o solo podriamos escribir 45.54f y el sistema por debajo aplica valueOf
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);



        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);






    }
}
