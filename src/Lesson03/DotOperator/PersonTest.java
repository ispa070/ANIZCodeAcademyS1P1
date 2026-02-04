package Lesson03.DotOperator;

public class PersonTest {

    public static void main(String[] args) {

        String fName = "Andreas";
        String mName = "Elias";
        String lName = "Mogensen";
        String nationality = "Danmark";
        int age = 47;

        String fName2 = "Michael";
        String mName2 = "B.";
        String lName2 = "Jordan";
        String nationality2 = "USA";
        int age2 = 38;

        OpretNytPersonObjekt(fName, mName, lName, age, nationality);
        OpretNytPersonObjekt(fName2, mName2, lName2, age2, nationality2);

    }

    public static void OpretNytPersonObjekt(String fName, String mName, String lName, int age, String nationality)
    {

        // Opretter et nyt Person-objekt
        Person p = new Person();

        // Sætter værdier
        p.firstName = fName;
        p.middleName = mName;
        p.lastName = lName;
        p.nationality = nationality;
        p.age = age;

        //Udskriv
        p.WritePersonInfo();

    }



}

