class WinCondition{
    public boolean WinnerFound;
    public int PointPlayer1 = 0;
    public int PointPlayer2 = 0;
    public boolean SuddenDeath = 0;
    public String Winner;

    public boolean winCon(){
        
        PointPlayer1 = player1.getSum();
        PointPlayer2 = player2.getSum();

        if(PointPlayer1 > 40 || PointPlayer2 > 40){
            
            if(PointPlayer1<PointPlayer2){
                WinnerFound = true;
                return WinnerFound;
            }
            else if(PointPlayer1>PointPlayer2){
                WinnerFound = true;
                return WinnerFound;
            }
            else if (PointPlayer1 == PointPlayer2){
                WinnerFound = false;
                if(!SuddenDeath){
                    SuddenDeath = true;
                }
                return WinnerFound;

            }
        }
        else{
            return false;
        }



    }
    
}