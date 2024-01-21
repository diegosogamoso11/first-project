import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosDeSistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero ");


         // String numeroStr =  scanner.nextLine();


        int numeroDecimal =0;
        try {
                 numeroDecimal = scanner.nextInt();                    //Integer.parseInt(numeroStr);
        }
        catch(InputMismatchException e ) {

            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);


        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal+ " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // int numeroBinario = 0b111110100;
        // System.out.println("numeroEntero = " + numeroBinario);

       // System.out.println("numero octal de = " + numeroBinario);
        // String mensaje = "numeroDecimal = " + numeroDecimal;
        //mensaje += "\n"+ resultadoBinario;
        //System.out.println(mensaje);



    }
}
