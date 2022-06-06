public class DiceDriver {

    public static void main(String[] args) {
        Dice myDice = new Dice();
        for (int i = 0; i < 10; i++) {
            myDice.roll();
            System.out.println(myDice.getValue());
        }
    }
}
