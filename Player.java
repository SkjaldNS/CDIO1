import java.util.List;

public class Player {

    public String name;
    public int sum;

    public Player(String name) {
        this.name = name;
        this.sum = 0;
    }

    public String getName() {
        return (name);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void pointSum(int points) {
        this.sum += points;
    }

    public int getSum() {
        return (sum);
    }
    // Player player1 = new Player("David");
    // System.out.println(player1.getName());
}