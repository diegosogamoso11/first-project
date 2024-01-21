public class EjemploStringMetodos {
    public static void main(String[] args) {


        String nombre ="Diego";

        // Saber el largo de la cadena, cuantos caracteres tiene ".lenght()"
        System.out.println("nombre.length() = " + nombre.length());

        // Poner todos nuestros caracteres en mayúsculas ".toUpperCase()"
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Poner todos nuestros caracteres en minúsculas "toLowerCase()"
        System.out.println("nombre.toUpperCase() = " + nombre.toLowerCase());

        // Comparar un String con otro a nivel de valor no de instancia ".equals"
        System.out.println("nombre.equals(\"Diego\") = " + nombre.equals("Diego"));

        // Comparar un String con casi el mismo método, solo que este ignora mayúsculas y minúsculas".equalsIgnoreCase"
        System.out.println("nombre.equalsIgnoreCase(\"diego\") = " + nombre.equalsIgnoreCase("diego"));


        String trabalenguas = "trabalenguas";
        // El método".replace" remplaza un carácter por otro, en este caso la letra por un punto.
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a","."));































    }
}
 