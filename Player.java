import java.util.List;

public class Player {

    public String name;
    public int sum;
    public static List instances = new arrayList();
    
    public Player(String name) {
        this.name = name;
        this.sum = 0;
        instances.add(new java.lang.ref.WeakReference(0));
    }
    public List getInstances() {
        return(instances);
    }
    
    public String getName() {
        return(name);
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