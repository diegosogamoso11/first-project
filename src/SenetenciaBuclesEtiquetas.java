public class SenetenciaBuclesEtiquetas {
    public static void main(String[] args) {

        String frase = "Tres triste tigres traga trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length(); // 43
        int maxPalabra = palabra.length(); // 5


        System.out.println(maxFrase);
        System.out.println(maxPalabra);


        int cantidad = 0;
        buscar: for (int i  = 0 ; i < maxFrase ; i++) {

             int k = i;

             for (int j = 0; j < maxPalabra; j++) {
                 if (frase.charAt(k++) != palabra.charAt(j)) {
                 continue buscar;
             }
         }
             cantidad++;    
         }
        System.out.println("Encontardo " + cantidad + " la palabra " + palabra);
    }
}
