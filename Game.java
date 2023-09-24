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
        System.out.println("Player 1: " + player1.getName() + " " + "Start sum: " + player1.getSum() + System.lineSeparator());
        System.out.println("Player 2: " + player2.getName() + " " + "Start sum: " + player2.getSum() + System.lineSeparator());

        //Showing game rules:
        System.out.println("""
The game rules are:

- The die has to be a six sided die (D6).
- The sum of each roll is added to the individual players points.
- The game has to support two players.
- The game has to support rolling two D6.
- A turn is one player rolling two D6 at once.
- A round consists of both players having one turn each.
- During a turn the combined sum of the dice roll is added to the player’s total points.
- The first player to achieve a total of 40 points or more at the end of a round wins, unless:
    * Both players achieve 40 points in the same round, in which case the player with the highest total
    score wins.
    * If both both players are tied in score, sudden death is enabled.
    * During sudden death, round(s) is played until a player achieves a higher score than the other
    player
                """);
    }
}
