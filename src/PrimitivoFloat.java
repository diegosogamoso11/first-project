public class PrimitivoFloat {
    public static void main(String[] args) {
        float realFloat =1.52e3f;  //1520.0
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de float: "+ Float.MAX_VALUE);
        System.out.println("Valor minimo de float: "+ Float.MIN_VALUE);

        System.out.println("------------------------------------");

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo  double corresponde en byte a " +  Double.BYTES);
        System.out.println("tipo  double corresponde en bites a " +  Double.SIZE);
        System.out.println("Valor maximo de  double: "+  Double.MAX_VALUE);
        System.out.println("Valor minimo de  double: "+  Double.MIN_VALUE);

    }
}
