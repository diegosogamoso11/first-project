public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k= 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        //  Para comparar en, con primitivos siempre con "==" con objetos, es con el método equal

        boolean b1 = i ==j;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);
    }
}
