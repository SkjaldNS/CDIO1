class WinCondition {
    public boolean winnerFound;
    public int pointPlayer1 = 0;
    public int pointPlayer2 = 0;
    public boolean suddenDeath = false;
    public String winner;

    public WinCondition(){
        this.winnerFound=false;
    }
    public static boolean getWinCon(WinCondition name){
        return name.winnerFound;
    }
    public static boolean getSuddenDeath(WinCondition name) {
        return name.suddenDeath;
    }

    public boolean winCon(Player player1,Player player2) {
        pointPlayer1 = Player.getSum(player1);
        pointPlayer2 = Player.getSum(player2);

        if (pointPlayer1 >= 40 || pointPlayer2 >= 40) {

            if (pointPlayer1 < pointPlayer2) {
                winnerFound = true;
                return winnerFound;
            } else if (pointPlayer1 > pointPlayer2) {
                winnerFound = true;
                return winnerFound;
            } else if (pointPlayer1 == pointPlayer2) {
                winnerFound = false;              
                if (!suddenDeath) {
                    suddenDeath = true;
                }
                return winnerFound;               
            }
            else {
                return false;
            }
        }
        return false;

    }
}