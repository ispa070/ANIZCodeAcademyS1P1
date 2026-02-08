package Lesson05.WhileLoop;
import java.util.Scanner;

public class SheepCounterTest {
    public static void main(String[] args) {

        System.out.println("How many sheep would you like to count down from?");
        Scanner scanner = new Scanner(System.in);
        int maxInput = scanner.nextInt();

        SheepCounter counter = new SheepCounter(maxInput);
        counter.countSheep();




}

}