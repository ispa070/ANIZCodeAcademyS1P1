package Lesson03.DotOperator;

// MovieTest.java
public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Inception";
        m1.genre = "Sci-Fi";
        m1.rating = 9;
        m1.year = 2010; //OBS, aner ikke om det er de korrekte årstal lol
        m1.playIt();

        Movie m2 = new Movie();
        m2.title = "The Dark Knight";
        m2.genre = "Action";
        m2.rating = 10;
        m2.year = 2009;
        m2.playIt();

        Movie m3 = new Movie();
        m3.title = "Frozen";
        m3.genre = "Animation";
        m3.rating = 8;
        m3.year = 2012;
        m3.playIt();

        Movie m4 = new Movie();
        m4.title = "Oppenheimer";
        m4.genre = "Drama";
        m4.rating = 10;
        m4.year = 2024;
        m4.playIt();

    }
}
