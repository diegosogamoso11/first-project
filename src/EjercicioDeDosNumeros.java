import java.util.Scanner;

public class EjercicioDeDosNumeros {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = scanner.nextInt();


        if (num1>num2){
            System.out.println("Ordenados de mayor a menor");
            System.out.println(num1 +"\n" + num2);
        }else{
            System.out.println("Ordenados de mayor a menor");
            System.out.println(num2 +"\n" + num1);

        }




    }
}
