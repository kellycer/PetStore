import org.w3c.dom.ls.LSOutput;

public class VeterinaryApp {
    public static void main(String[] args) {
        Turtle turtle1 = new Turtle("herida", "laud");
        Horse horse1 = new Horse("herido", "frisón");

        System.out.println("la enfermedad de la tortuga es  " + turtle1.getDisease());
        System.out.println("la enfermedad del caballo es  " + horse1.getDisease());

        //probando la sobrecarga de metodos

        System.out.println("metodo toString() de Turtle " + turtle1.toString());
        System.out.println("metodo toString() de Horse " + horse1.toString());
        System.out.println(" " + turtle1.soy());
        System.out.println(" " + horse1.soy());



    }
}
