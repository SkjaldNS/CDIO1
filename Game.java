import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Player player1;
        // Player player2;
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        var scanner = new java.util.Scanner(System.in);

        if (Player.getName(player1).toLowerCase().equals("-test")) {
            System.out.println("Please enter the wanted numbers of test rolls: ");
            int test = scanner.nextInt();
            String resultRoll = TestDiceRolls.executeDiceRollsTest(test);
            String resultTime = TestTime.executeTimeTest(test);
            System.out.println(resultRoll + "\n" + resultTime);
        } else {
            // Showing start values.
            System.out.println(
                    "Player 1: " + Player.getName(player1) + " " + "Start sum: " + Player.getSum(player1) + System.lineSeparator());
            System.out.println(
                    "Player 2: " + Player.getName(player2) + " " + "Start sum: " + Player.getSum(player2) + System.lineSeparator());

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
            var winConObj = new WinCondition();
            boolean winnerGame = false;
            while (!winnerGame){
                
                System.out.println(Player.getName(player1) + ", to roll the dice, press Enter");
                scanner.nextLine();
                Die turnDie = new Die();
                int dieArray[] = Die.getDie(turnDie);
                Player.pointSum(dieArray[2],player1);
                System.out.println("You rolled " + dieArray[0] + "+" + dieArray[1]+" for a total of " + dieArray[2]+"."); 
                System.out.println(Player.getName(player2) + ", to roll the dice, press Enter");
                scanner.nextLine();
                turnDie = new Die();
                dieArray = Die.getDie(turnDie);
                Player.pointSum(dieArray[2],player2);
                System.out.println("You rolled " + dieArray[0] + "+" + dieArray[1]+" for a total of " + dieArray[2]+".");
                System.out.println(Player.getSum(player1)+" "+Player.getSum(player2));
                winnerGame = winConObj.winCon(player1, player2);
                  
            }
            if(Player.getSum(player1)> Player.getSum(player2)){
                System.out.println(Player.getName(player1)+" won the game with "+Player.getSum(player1)+" points! "+Player.getName(player2)+" ended in second place with "+Player.getSum(player2)+" points.");
            }
            else {
                System.out.println(Player.getName(player2)+" won the game with "+Player.getSum(player2)+" points! "+Player.getName(player1)+" ended in second place with "+Player.getSum(player1)+" points.");
            }        
        }
    }

    public static Player createPlayer(int i) {
        // Taking the names of players.
        var scannerCreate = new java.util.Scanner(System.in);
        System.out.println("What is the name of player " + i + "?");
        var name = scannerCreate.nextLine();
        Player player = new Player(name);
        return player;
    }
}