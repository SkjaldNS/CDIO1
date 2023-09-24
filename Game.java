import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        //Taking the names of players.
        System.out.println("What's the name of player1? ");
        var name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("What's the name of player2? ");
        var name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        //Showing start values.
        System.out.println("Player 1: " + player1.getName() + " " + "Start sum: " + player1.getSum());
        System.out.println("Player 2: " + player2.getName() + " " + "Start sum: " + player2.getSum());
    }
}
