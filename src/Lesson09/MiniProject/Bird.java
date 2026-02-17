package Lesson09.MiniProject;

/*
 * Subclass: Bird
 * Inherits from Pet
 */
public class Bird extends Pet {
    private double wingSpan;

    public Bird(String name) {
        super(name); // Call constructor of Pet
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird: " + getName() + " (chirp, chirp!)";
    }
}
