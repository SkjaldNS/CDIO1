import java.util.Random;

public class Die {
    public int die1;
    public int die2;
    
    public Die(){
        this.die1 = rollDie();
        this.die2 = rollDie();
    }
    
    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    public int[] getDie(){
        var die = new Die();
        int dieArray[] = new int[3];
        for (int i = 0; i < dieArray.length-1; i++){
            dieArray[element] = rollDie();
        }
        dieArray[2] = dieArray[0]+dieArray[1];
        return dieArray;
    }
}
