public class HelloWord {
    public static void main(String[] args) {
        String saludar = "Hola, mi nombre es Diego como están";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        int numero2 = 15;
        System.out.println("numero = " + numero);
        boolean valor = true;

        if (valor){
            System.out.println("numero = " + numero);

        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre="Diego";

        if(numero > 10){
            nombre="Alejandro";
        }
        System.out.println("nombre = " + nombre);

        
    }
}
