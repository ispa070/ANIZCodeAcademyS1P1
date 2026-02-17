package Lesson09.MiniProject;

/*
 * Subclass: Bird
 * Inherits from Pet
 */
public class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, double wingSpan) {
        super(name); // Call constructor of Pet
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }


    @Override
    public String toString() {
        return "Bird: " + getName() + "| The wingspan of "+ getName()+" is " + wingSpan +" cm. " + getName() +" seems happy about that and does a little: Chirp, chirp!";
    }
}
