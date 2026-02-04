package Lesson03.DotOperator;

public class Person {
    // Attributter
    String firstName;
    String lastName;
    String middleName;
    String nationality;
    int age;

    public void WritePersonInfo()
    {
        // Udskriver oplysninger
        System.out.println("Navn: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Alder: " + age + ", Fra: " + nationality );
    }
}
