class WinCondition {
    public boolean winnerFound;
    public int pointPlayer1 = 0;
    public int pointPlayer2 = 0;
    public boolean suddenDeath = false;
    public String winner;

    public boolean winCon() {
        pointPlayer1 = player1.getSum();
        pointPlayer2 = player2.getSum();

        if (pointPlayer1 > 40 || pointPlayer2 > 40) {

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
        } else {
            return false;
        }
    }
}