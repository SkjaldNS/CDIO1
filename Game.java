import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        //Taking the names of players.
        System.out.println("What's the name of player1? ");
        var name1 = scanner.nextLine();
        var player1 = new Player(name1);

        System.out.println("What's the name of player2? ");
        var name2 = scanner.nextLine();
        var player2 = new Player(name2);

        System.out.println(getName(player1) + getName(player2));
    }
}
