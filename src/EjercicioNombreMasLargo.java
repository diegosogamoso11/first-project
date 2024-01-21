import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {


        String persona1 = JOptionPane.showInputDialog("nombre y apellido de ");
        String persona2 = JOptionPane.showInputDialog("nombre y apellido de ");
        String persona3 = JOptionPane.showInputDialog("nombre y apellido de ");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);

    }}
