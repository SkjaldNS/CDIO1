class WinCondition{
    public boolean WinnerFound;

    public WinCondition(boolean WinnerFound){
        this.WinnerFound = WinnerFound;
    }
    public boolean winCon(){
        
        var PointPlayer1 = new getSum();
        var PointPlayer2 = new getSum();

        if(PointPlayer1 > 40 || PointPlayer2 > 40){
            if(PointPlayer1<PointPlayer2){
                this.WinnerFound = true;
                return this.WinnerFound;
            }
            else if (PointPlayer1 == PointPlayer2){
                this.WinnerFound = false;
                SuddenDeath();
            }
        }
        else{
            return false;
        }



    }
    public void SuddenDeath(){
        while(this.WinnerFound == false){
            

        }
    }
}