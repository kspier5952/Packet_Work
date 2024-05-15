public class DicePercents {
    public static void main(String[]args){
        int counter7 = 0;
        int counter11 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter12 = 0;
        int percent1;
        int percent2;
        for (int i = 1; i<=100; i++) {
            Dice d = new Dice();
            d.roll();
            int n = d.getTotal();
            if (n == 7 || n == 11){
                counter7 += 1;
            }
            if (n == 2 || n ==3 || n == 12) {
                counter2 += 1;
            }
            percent1 = (counter7 + counter11);
            percent2 = (counter2 + counter3 + counter12);
            if (i == 100) {
                System.out.println("under this one");
                System.out.println("You rolled a 7 or 11 " + percent1 + "% of the time.");
                System.out.println("You rolled a 2, 3, or 12 " + percent2 + "% of the time.");
            }
        }
    }
}
