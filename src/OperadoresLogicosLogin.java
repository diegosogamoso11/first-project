import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Diego";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "123456";

        usernames[2] = "pepe";
        passwords[2] = "123456"; */

        String [] usernames = {"Diego","admin","pepe"};
        String [] passwords = {"123456","123456","123456"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese username");

        String usuario = scanner.next();
        System.out.println("Ingrese contraseña");
        String contraseña = scanner.next();

        boolean esAutenticado = false;
        for (int i= 0 ;i < usernames.length; i++ ){

        if(usernames[i].equals(usuario) && passwords[i].equals(contraseña)) {

            esAutenticado = true;
            break;
        }
    }

        if (esAutenticado){

            System.out.println("Bienvenido Usuario ".concat(usuario));
    }
        else {
            System.out.println("Requiere autenticación");
            System.out.println("Username o contraseña incorrectos");

        }}}


