import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Player player1;
        // Player player2;
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);

        if (player1.getName().toLowerCase() == "-test") {
            var scanner = new java.util.Scanner(System.in);
            System.out.println("Please enter the wanted numbers of test rolls: ");
            int test = scanner.nextInt();
            String resultRoll = TestDiceRolls.executeDiceRollsTest(test);
            String resultTime = TestTime.executeTimeTest(test);
            System.out.println(resultRoll + "\n" + resultTime);
        } else {
            // Showing start values.
            System.out.println(
                    "Player 1: " + player1.getName() + " " + "Start sum: " + player1.getSum() + System.lineSeparator());
            System.out.println(
                    "Player 2: " + player2.getName() + " " + "Start sum: " + player2.getSum() + System.lineSeparator());

            // Showing game rules:
            System.out.println("""
                    The game rules are:

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

    public static Player createPlayer(int i) {
        // Taking the names of players.
        var scannerCreate = new java.util.Scanner(System.in);
        System.out.println("What is the name of player " + i + "?");
        var name = scannerCreate.nextLine();
        Player player = new Player(name);
        scannerCreate.close();
        return player;
    }
}
