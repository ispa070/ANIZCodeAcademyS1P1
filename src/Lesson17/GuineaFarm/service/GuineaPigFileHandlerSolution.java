package Lesson17.GuineaFarm.service;



import Lesson17.GuineaFarm.model.*;

import java.io.*;
import java.util.ArrayList;

public class GuineaPigFileHandlerSolution {

    // #2 Denne konstant indeholder navnet på filen.
    // final betyder, at værdien ikke kan ændres, og static betyder, at variablen tilhører klassen.
    private static final String FILE_NAME = "guineapigs.csv"; //

    // #1 Denne metode læser data fra en CSV-fil og returnerer en liste med objekter.
    // Listen kan indeholde forskellige typer marsvin, fordi de nedarver fra samme superklasse.
    public ArrayList<GuineaPig> loadPigs() {

        // #8 Denne liste bruges til at gemme alle objekter der læses fra filen.
        ArrayList<GuineaPig> pigs = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            // #5 Denne konstruktion bruges til at læse filen linje for linje, indtil filen er slut.
            while ((line = reader.readLine()) != null) {

                // #3 Denne metode opdeler en tekstlinje fra CSV-filen i flere dele ved hjælp af kommaer.
                String[] parts = line.split(",");

                String type = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double weight = Double.parseDouble(parts[3]);
                // #6 Her bruges en enum til at konvertere tekst til en foruddefineret værdi.
                Color color = Color.valueOf(parts[4]);
                Breed breed = Breed.valueOf(parts[5]);

                // #7 Denne struktur bruges til at afgøre hvilken type objekt der skal oprettes.
                if (type.equals("PET")) {

                    boolean goodWithChildren =
                            Boolean.parseBoolean(parts[6]);

                    // #9 Her oprettes et objekt af typen PetGuineaPig og tilføjes til listen.
                    pigs.add(new PetGuineaPig(
                            name, age, weight,
                            color, breed,
                            goodWithChildren));

                } else if (type.equals("SHOW")) {

                    // #4 Her konverteres tekst fra filen til et heltal.
                    // Dette er nødvendigt fordi data fra filer altid læses som tekst.
                    int score = Integer.parseInt(parts[6]);

                    pigs.add(new ShowGuineaPig(
                            name, age, weight,
                            color, breed,
                            score));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pigs;
    }
    // #9 Denne kode skriver data til en CSV-fil
    public void savePigs(ArrayList<GuineaPig> pigs) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (GuineaPig pig : pigs) {
                // #11 Her bruges instanceof til at undersøge hvilken type objekt der ligger i listen
                if (pig instanceof PetGuineaPig) {
                    // #12 Her konverteres et objekt fra superklassen til en mere specifik klasse
                    PetGuineaPig p = (PetGuineaPig) pig;

                    writer.write("PET," +
                            p.getName() + "," +
                            p.getAge() + "," +
                            p.getWeight() + "," +
                            p.getColor() + "," +
                            p.getBreed() + "," +
                            p.isGoodWithChildren());

                } else if (pig instanceof ShowGuineaPig) {

                    ShowGuineaPig s = (ShowGuineaPig) pig;

                    writer.write("SHOW," +
                            s.getName() + "," +
                            s.getAge() + "," +
                            s.getWeight() + "," +
                            s.getColor() + "," +
                            s.getBreed() + "," +
                            s.getCompetitionScore());
                }
                // #13 Denne metode sikrer, at hvert objekt skrives på en ny linje i filen
                writer.newLine();
            }
        // #14 Denne blok håndterer fejl der kan opstå ved læsning eller skrivning af filer.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}