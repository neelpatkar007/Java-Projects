public class Lab3Task4 {
    public static void main(String args[]) {
        // Creating two Person objects
        Person person1 = new Person();
        person1.setName("John");
        person1.setSurname("Doe");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setSurname("Smith");
        person2.setAge(30);

        // Declaring a third reference (person3) and pointing it to person1
        Person person3 = person1;

        // Checking that person3 points to the desired object
        System.out.println("Details of person3 (pointing to person1): " + person3.details());

        // Modifying person3's age and checking the effect on person1
        person3.setAge(35);
        System.out.println("Details of person1 after modifying person3's age: " + person1.details());
    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to return information about the person
    public String details() {
        return getName() + " " + getSurname() + " years " + getAge();
    }
}
