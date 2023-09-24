class WinCondition{
    public boolean WinnerFound;
    public int PointPlayer1;
    public int PointPlayer2;
    public WinCondition(boolean WinnerFound, int PointPlayer1, int PointPlayer2){
        this.WinnerFound    = WinnerFound;
        this.PointPlayer1   = PointPlayer1;
        this.PointPlayer2   = PointPlayer2;
    }
    public boolean winCon(){
        
        var PointPlayer1 = new getSum();
        var PointPlayer2 = new getSum();

        if(PointPlayer1 > 40 || PointPlayer2 > 40){
            if(PointPlayer1<PointPlayer2){
                this.WinnerFound = true;
                return this.WinnerFound;
            }
            else if(PointPlayer1>PointPlayer2){
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
            var PointPlayer1 = new getSum();
            var PointPlayer2 = new getSum();

            if(PointPlayer1 < PointPlayer2){
                this.WinnerFound = true;
            }
            else if( PointPlayer1 > PointPlayer2){
                this.WinnerFound = true;
                
            }

            

        }
    }
}