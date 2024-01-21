public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {


        String archivo = "alguna_imagen.jpeg";
        System.out.println("archivo = " + archivo.length());

        // Método ".substring()" Escojo desde el indice que quiero mostrar.
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
    }
}
