package Lesson05.WhileLoop;

public class SheepCounter {
    private int sheep;

    public SheepCounter(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        int i = sheep;
        while (i >= 0) { // Grænsen, så tælleren stopper ved "0"
            i--; // Den tæller alle tal så vi kan filtrere på logisk vis vha. modulus. OBS! Den tæller nedad, hvorfor der er en nedre grænse.
            if (i % 2 == 0) { // tæller kun lige numre på denne måde
                System.out.println("Sheep number " + i + " 🐑");
            }
        }

        System.out.println("You fall asleep... 😴");
    }
}
