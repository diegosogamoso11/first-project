public class ConversionDeTipos {
    public static void main(String[] args) {


        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9999999.99e-3";

        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String loicoStr = "true";

        boolean logicoBoolean = Boolean.parseBoolean(loicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr=Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroReal =   1234.56;
        String otroRealStr = Double.toString(otroReal);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = Float.toString(1.2343f);
        System.out.println("otroRealStr = " + otroRealStr);


        int i = 1000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

    }


}
