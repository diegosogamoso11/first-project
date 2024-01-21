import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer integrante");
        String integrante1 = scanner.nextLine();

        System.out.println("Ingrese el segundo integrante");
        String integrante2 = scanner.nextLine();

        System.out.println("Ingrese el tercer integrante");
        String integrante3 = scanner.nextLine();




        String letra1 = integrante1.substring(1,2).toUpperCase() + "."+ integrante1.substring(integrante1.length()-2);
        System.out.println("letra1 = " + letra1);

        String letra2 = integrante2.substring(1,2).toUpperCase() + "."+ integrante2.substring(integrante2.length()-2);
        System.out.println("letra2 = " + letra2);

        String letra3 = integrante3.substring(1,2).toUpperCase() + "."+ integrante3.substring(integrante3.length()-2);
        System.out.println("letra3 = " + letra3);

        String todo = letra1 + "_" +letra2 + "_" + letra3;
        System.out.println("Resultado final = " + todo);

    }
}
