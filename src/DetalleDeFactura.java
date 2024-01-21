import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {


        double impuesto = 0.19;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese nombre de la factura");
        String nombre =  scanner.nextLine();


        System.out.println("Ingrese precios del producto 1");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese precios del producto 2");
        double precio2 = scanner.nextDouble();


        double total = precio1+precio2;
        double impuestoTotal= total*impuesto;
        double totalDeTodo = impuestoTotal+total;

        System.out.println("La factura producto de" +nombre + "tiene un total bruto de "+ total+
                " con un impuesto de "+ impuestoTotal +" y el monto después de impuesto es de "+ totalDeTodo);
























    }
}
