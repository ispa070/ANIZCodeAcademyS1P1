package Lesson10.abstraction.MiniProject;

public abstract class Chair extends Furniture {

    public Chair(String name, double price, String material) {
        super(name, price, material);
    }

    public void setDescription() {
        System.out.println("Description: Super comfortable and elegant timeless design at an affordable price.");
    }

    public void getDescription() {
        setDescription();
    }


    public String toString() {
        return super.toString();
    }
}
