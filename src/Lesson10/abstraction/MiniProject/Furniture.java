package Lesson10.abstraction.MiniProject;

public abstract class Furniture {

    //Furniture attributes
    private String name;
    private double price;
    private String material;

    //Furniture constructor
    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //getDescription-metode (abstract)
    public abstract void getDescription();

    //calculateShippingCost-metode (abstract)
    //public abstract double calculateShippingCost();

    //toString method
    @Override
    public String toString() {
        return "Furniture type: " + name + " | Price: " + price + " | Type of material: " + material;
    }

}
