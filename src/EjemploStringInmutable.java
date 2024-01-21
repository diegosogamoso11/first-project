public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = " Programación Java";
        String profesor = " Andrez Guzman ";

        String resultado = curso.concat((profesor));
       //  System.out.println("curso = " + curso);
       // System.out.println("resultado = " + resultado);
       // System.out.println(curso==resultado);

       String resultado2 = curso.transform(c->{
          return c +" con " + profesor;
       });

        System.out.println("resultado2 = " + resultado2);


        //Cambia todas las 'a', por 'A' mayúscula, gracias a el método ".replace()"
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);


























    }
}