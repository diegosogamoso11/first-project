public class OperadoresIncrementables {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i; // i = i + 1 ;

        // Pre incremento
        System.out.println("i  = " + i);
        System.out.println("j = " + j);


        // Post Incremento

        i=2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
