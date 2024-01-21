import java.util.Scanner;

public class EjercicioGasolina {
    public static void main(String[] args) {


        double estanque = 0.0;
        System.out.println("Introduzca la cantidad del tanque, maximo 70 litros ");
        Scanner scanner = new Scanner(System.in);
        estanque = scanner.nextDouble();

        if (estanque == 70) {
            System.out.println("Estanque lleno");

        } else if (estanque >= 60 && estanque < 70) {
            System.out.println("Estanque casi lleno");

        } else if (estanque >= 40 && estanque < 60) {
            System.out.println("Estanque  3/4");

        } else if (estanque >= 35 && estanque < 40) {
            System.out.println("Medio Estanque ");

        } else if (estanque >= 20  && estanque < 35) {
            System.out.println("Suficiente");
        }
        else if (estanque > 70){
            System.out.println("La cantidad tiene que estar entre 1-70");
        }
        else {
            System.out.println("Insuficiente");
        }
    }}


