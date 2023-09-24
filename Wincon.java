class WinCondition{
    public WinCondition(){

    }
    public boolean winCon(){
        var PointPlayer1 = new getSum();
        var PointPlayer2 = new getSum();

        if(PointPlayer1 > 40 || PointPlayer2 > 40){
            if(PointPlayer1<PointPlayer2){
                return true;
            }
            else if (PointPlayer1 == PointPlayer2){
                SuddenDeath();
            }
        }
        else{
            return false;
        }



    }
    public void SuddenDeath(){
        while(true){
            
        }
    }
}