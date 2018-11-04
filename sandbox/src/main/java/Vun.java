public class Vun {
    public static void main (String[] args) {
        hello("world");

        hello("user");
        hello("Женя");
        double len=5;
        System.out.println("Сторора квардрата " + len + " = " +area(len) );

    }
    public static void hello (String somebody) {


            System.out.println("Hello " + somebody + "!");
    }
 public static double area (double l) {
        return  l*l;

    }
}

