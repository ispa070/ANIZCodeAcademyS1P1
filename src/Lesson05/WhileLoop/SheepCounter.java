package Lesson05.WhileLoop;

public class SheepCounter {
    private int sheep;

    public SheepCounter(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        int i = sheep;
        while (i >= 0) {
            i--; // Den tæller alle tal så vi kan filtrere på logisk vis vha. modulus (i % 2 == 0)
            if (i % 2 == 0) {
                System.out.println("Sheep number " + i + " 🐑");
            }
        }

        System.out.println("You fall asleep... 😴");
    }
}
