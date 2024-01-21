public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // arreglo = [C@34a245ab

        char[] arreglo = trabalenguas.toCharArray(); // arreglo = [C@34a245ab ---  trabalenguas

        System.out.println("arreglo = " + arreglo);
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i=0 ; i< largo;i++ ){

            System.out.println("arreglo = " + arreglo[i]);

        }
       //  System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j=0; j<l; j++){

            System.out.println("-----------");
            System.out.println("arreglo2[j] = " + arreglo2[j]);
        }

































    }
}
 