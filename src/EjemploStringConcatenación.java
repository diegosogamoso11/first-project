public class EjemploStringConcatenación {

    public static void main(String[] args) {
        String curso = " Programación Java";
        String profesor = "Andrez Guzman ";

        String detalle = curso + " com el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int a = 10;
        int b= 5;

        System.out.println(detalle + (a+ b) );
        System.out.println(a+b+detalle);

        // Otra forma de concatenar strings, con el metodo ".concat();"
        String detalle2 = curso.concat(" Con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);





    }
}