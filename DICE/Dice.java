public class Dice {
    private int die1, die2;
    
    public Dice() {
        die1 = 3;
        die2 = 5;
    }
    public void roll() {
        die1 = (1 + (int) (Math.random() * (6)));
        die2 = (1 + (int) (Math.random() * (6)));
    }
    public int getTotal() {
        int total = die1 + die2;
        return total;
    }
}
