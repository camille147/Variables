
public class Exo3 {
    public static void main(String[] args) {
        int entier = 5;
        double decimal = 2.37;
        char caractere = 'C';
        boolean booleenVar = false;
        byte byteVar = -15;
        short shortVar = 28025;
        long longVar = 5000000005L;
        float floatVar = 3.1547856f;

        // ces var sont des ref des var primitives
        String chaine = "Hello Java";
        int[] tableau = {1, 8, 4, 45, 15};
        Object objet = new Object();
        Integer myVarNull = null;
        Double decimalPlusImportant = 2.375849;

        System.out.println("entier: " + entier);
        System.out.println("decimal: " + decimal);  
        System.out.println("caractere: " + caractere);
        System.out.println("booleenVar: " + booleenVar);
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);

        System.out.println("chaine: " + chaine);
        System.out.println("tableau: " + tableau);
        System.out.println("objet: " + objet);
        System.out.println("myVarNull: " + myVarNull);
        System.out.println("decimalPlusImportant: " + decimalPlusImportant);


    }
}
