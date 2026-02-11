package Lesson07.Array.ReferenceDataTyper;

// Main-klasse
public class MushroomBasket {
    public static void main(String[] args) {
        // Array af svampe
        Mushroom[] basket = new Mushroom[5];
        basket[0] = new Mushroom("Champignon", "Hvid");
        basket[1] = new Mushroom("Portobello", "Brun");
        basket[2] = new Mushroom("Østershat", "Grå");
        basket[3] = new Mushroom("Rød fluesvamp", "Rød");
        basket[4] = new Mushroom("Shiitake", "Brun");


        // Udskriv alle svampe med toString()
        System.out.println("Svampe i kurven:");
        for (Mushroom m : basket) {
            System.out.println(m); // automatisk kalder toString()
        }

        System.out.println();

        // Søge funktion i basket()
        Mushroom checkMushroom = new Mushroom("Østershat", "Grå");
        boolean found = false;

        for (Mushroom m : basket) {
            if (m.equals(checkMushroom)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("There's a " + checkMushroom + " in your basket.");
        } else {
            System.out.println("There's no " + checkMushroom + " in your basket.");
        }
        int colorCount = 0;
        String mushroomColor = "";
        for(Mushroom m : basket) {
            if (m.getColor().equals("Brun")) {
                colorCount++;
                mushroomColor = m.getColor();
            }
        }
        System.out.println("There are " + colorCount + " instance(s) of Mushrooms of the color (" + mushroomColor + ") in your basket.");
        }

}

            /* Eksempel på ikke-match
            Mushroom wrongMushroom = new Mushroom("Champignon", "Brun");
            if (basket[1].equals(wrongMushroom)) {
                System.out.println("Match!");
            } else {
                System.out.println("The third mushroom does not match Champignon (Brun). "); */







