package Lesson06.DiceMan;
import java.util.Random;

public class DiceMan {

    //attributter (hvad ved DiceMan-klassen om sig selv)
    private String name;
    private int activitiesDone;
    private int timesSlept;
    private Random rnd;

    // konstruktøren
    public DiceMan(String name) {
        this.name = name;
        this.activitiesDone = 0;
        this.timesSlept = 0;
        this.rnd = new Random();

    }

    //rulle terning metode vha. random
    public int rollDice() {
        return rnd.nextInt(6) + 1;
    }

    public String doActivity(int roll) {
        if (roll == 1) {
            this.activitiesDone++;
            return "Eat Breakfast";
        } else if (roll == 2) {
            this.activitiesDone++;
            return "Study something boring";
        } else if (roll == 3) {
            this.activitiesDone++;
            return "Go swimming";
        } else if (roll == 4) {
            this.activitiesDone++;
            return "Go fishing";
        } else if (roll == 5) {
            this.activitiesDone++;
            return "Call his Mom";
        } else if (roll == 6) {
            this.activitiesDone++;
            this.timesSlept++;
            return "Go back to bed";
        } else {
            return "Error";
        }

    }

    public int getActivitiesDone() {
        return this.activitiesDone;
    }

    public int getTimesSlept() {
        return this.timesSlept;
    }

}
