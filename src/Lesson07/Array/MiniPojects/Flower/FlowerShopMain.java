package Lesson07.Array.MiniPojects.Flower;

import java.util.Arrays;

public class FlowerShopMain {

    public static void main(String[] args) {

        Flower items = new Flower();//du stoppede her

        //flower array
        Flower[] flowerItem = new Flower[3];
        flowerItem[0] = new Flower("Roser", "Røde", 79.99);
        flowerItem[1] = new Flower("Tulipaner", "Gule", 29.99);
        flowerItem[2] = new Flower("Liljer", "Hvide", 59.99);

        //print alle flowerItem fra Flower[]
        for (int i = 0; i < flowerItem.length; i++) {
            if (flowerItem[i] != null) {
                System.out.println(flowerItem[i]);
            }
        }

        //print tomt linje mellemrum
        System.out.println();

        //for loop, der "traverser" flowerItem i vores Flower[] array
        for (Flower item : flowerItem) {
            System.out.println(item);
        }

        displayItemCategory();
        System.out.println();
    }
}