package Lesson06.DiceMan;

public class Main {


    public static void main(String[] args) {
        DiceMan diceMan1 = new DiceMan("Brian");

        while (diceMan1.getActivitiesDone() < 5) {
            if (diceMan1.getTimesSlept() == 3) {
                System.out.println("Brian gets lazy and goes to sleep...");
                break;
            }

            int roll = diceMan1.rollDice();
            System.out.println("Brian " + diceMan1.doActivity(roll));

        }

    }

}
