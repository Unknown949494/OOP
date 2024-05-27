package oop.labor14;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthDate;

    public Person(String firstName, String lastName, int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

}
