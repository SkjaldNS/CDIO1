import java.util.Random;

public class Die {
    public static void main(String[] args) {
        
        int die1 = rollDie();
        int die2 = rollDie();

        
        int sum = die1 + die2;

       
        System.out.println("Result:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total sum: " + sum);
    }

    
    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
