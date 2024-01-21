import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr =  JOptionPane.showInputDialog(null, "Ingrese un numero entero ");


        int numeroDecimal =0;
        try {
                 numeroDecimal =Integer.parseInt(numeroStr);
        }
        catch(NumberFormatException e ) {

            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);


        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal+ " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // int numeroBinario = 0b111110100;
        // System.out.println("numeroEntero = " + numeroBinario);

       // System.out.println("numero octal de = " + numeroBinario);
        String mensaje = "numeroDecimal = " + numeroDecimal;
         // mensaje += "\n"+ resultadoBinario;
        // JOptionPane.showMessageDialog(null, mensaje);



    }
}
