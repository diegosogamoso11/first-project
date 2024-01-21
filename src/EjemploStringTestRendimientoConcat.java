public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {



        String a = "a";
        String b ="b";
        String c = a;

        long inicio = System.currentTimeMillis();

       for (int i=0;i <500;i++){
           //   String detalle2 = curso.concat(" Con ").concat(profesor);
           // c= c.concat(a).concat(b).concat("\n"); // 500=> 2
           // c += a+b+"\n";// 500=> 15

         }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
         System.out.println("c = " + c);



    }
}