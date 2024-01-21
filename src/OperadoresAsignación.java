public class OperadoresAsignación {
    public static void main(String[] args) {

        int  i = 5;
        System.out.println("i = " + i);
        int j = i + 4;
        System.out.println("j = " + j);
        i += 2;
        System.out.println("i = " + i);
        i += 5 ;
        System.out.println("i = " + i);

        String sqlString = "select * from clientes as c ";
        sqlString += "where c.nombre = Diego ";
        sqlString += "and c.activo = 1";
        System.out.println("sqlString = " + sqlString);

}}
