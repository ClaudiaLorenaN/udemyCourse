import javax.lang.model.SourceVersion;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        
        for(int i = 0;  i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 3ms, 10.000 84ms, 100.000 => 4765ms
            //c += a +  b + "\n"; // 500 => 12ms, 1000 => 14ms, 10.000 54ms, 100.000 => 1730
            sb.append(a).append(b).append("\n"); //500=> 0ms, 1000 => 1ms, 10.000 2ms, 100.000 => 7ms

        }
        long fin = System.currentTimeMillis();
        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
