import java.util.Random;

public class Die {
    public int die1;
    public int die2;

    public Die() {
        this.die1 = rollDie();
        this.die2 = rollDie();
    }

    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static int[] getDie(Die name) {
        var die = name;
        int dieArray[] = new int[3];
        for (int i = 0; i < dieArray.length - 1; i++) {
            dieArray[i] = rollDie();
        }
        dieArray[2] = dieArray[0] + dieArray[1];
        return dieArray;
    }
}
