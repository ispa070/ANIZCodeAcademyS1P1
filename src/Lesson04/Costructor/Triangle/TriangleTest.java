package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();

        Triangle t3 = new Triangle(8, 9, 10);
        t3.showInfo();

        double area1 = t1.getArea();
        double area2 = t2.getArea();
        double area3 = t3.getArea();

        System.out.println("\nResultat: ");

        if (area1 > area2 && area1 > area3) {
            System.out.println("Triangel 1 er størst.");
        } else if (area2 > area1 && area2 > area3) {
            System.out.println("Triangel 2 er størst.");
        } else if (area3 > area1 && area3 > area2) {
            System.out.println("Triangel 3 er størst.");
        }
    }
}