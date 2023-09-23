public class Player {

    public String name;
    public int sum;

    public Player(String name) {
        this.name = "";
        this.sum = 0;
    }
   
    public setName(String name) {
        this.name = name;
    }
    public String getName() {
        return(name);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public int getSum() {
        return (sum);
    }

    public void pointSum(int points) {
        this.sum += points;
    }
}