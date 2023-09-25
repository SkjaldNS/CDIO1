import java.util.Random;

class Showcase {
    public static void main(String[] args){
        var scanner = new java.util.Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        String testName = scanner.nextLine();
        String result = TestDiceRolls.executeDiceRollsTest(testName, test);
        System.out.println(result);
        result = TestTime.executeTimeTest(testName, test);
        System.out.println(result);

    }
}
class Die {
    int die;
    public Die(){
        die=0;
    }
    public int rollDie(){
        Random rand = new Random();
        int die = rand.nextInt(6)+1;
        return die;
    }
}