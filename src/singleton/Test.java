package singleton;

public class Test {
    public static void main(String[] args){
        Configurador c = Configurador.getConfigurador("mi url","mi base de datos");
        Configurador c2 = Configurador.getConfigurador("miurl2", "Database");


        //Diferencia: Configurador c3 = new Configurador("mitrer", "dssfsdf");
        System.out.println(c.getUrl() +
                "\n" + c.getBaseDatos());
    }
}
