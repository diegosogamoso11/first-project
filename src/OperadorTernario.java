import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String var = 7==54 ? "si es verdadero" : "si es falso";
        System.out.println(var);


        String estado = "";
        double promedio = 6.2;
         // estado = promedio >= 5.49 ? "Aprobado": "Rechazado";



        double matematicas = 0.0;
        double ciencias = 0.0;
        double ingles = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese nota de matematicas del 1.0 aol 5.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese nota de ciencias del 1.0 aol 5.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese nota de ingles del 1.0 aol 5.0");
        ingles = s.nextDouble();

        promedio = (matematicas + ciencias + ingles ) / 3;
        estado = promedio >= 3.0 ? "Aprobado": "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);


         /* double promedio= 6.2;
        if ( promedio >= 5.49){
            System.out.println("Aprobado");
        }else {
            System.out.println("Rechazado");
        } */
    }
}
