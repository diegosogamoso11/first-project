public class EjemploString {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean esIgual =curso==curso2;
        System.out.println("esIgual = " + esIgual);

        // IgnoreCase, Ignora mayúsculas y minúsculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3= "Programación Java";
        esIgual = curso ==curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
