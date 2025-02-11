public class Exo10 {
    public static void main(String[] args) {

        int my42Int = 42;
        double my42Double = 42.0;
        boolean my42Boolean = true;
        char my42Char = 'q';
        String my42String = "quarante-deux";

        System.out.println("Type de my42TypeInt: " + getType(my42Int));
        System.out.println("Type de my42TypeDouble: " + getType(my42Double));
        System.out.println("Type de my42TypeBoolean: " + getType(my42Boolean));
        System.out.println("Type de my42TypeChar: " + getType(my42Char));
        System.out.println("Type de my42TypeString: " + getType(my42String));

    }
    public static String getType(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
