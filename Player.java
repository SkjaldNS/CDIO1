import java.util.List;
import java.util.Scanner;

public class Player {

    public String name;
    public int sum;

    public Player(String name) 
        {while(name.equals("")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a valid name: ");
            name = scanner.nextLine();
        }
        this.name = name;
        this.sum = 0;
    }

    public static String getName(Player name) {
        return name.name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static void pointSum(int points, Player name) {
        name.sum += points;
    }

    public static int getSum(Player name) {
        return name.sum;
    }
    // Player player1 = new Player("David");
    // System.out.println(player1.getName());
}