import java.util.Random;

public class Exo9 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(42) + 1; //permet de générer un nb al entre 1 et 42

        boolean is42 = (rand == 42);   // si rand est = 42 alors c'est true, sinon c'est false

        System.out.println("Le nombre est-il égal à 42 ? " + is42 + " Le nombre est : " + rand);
    }
}
