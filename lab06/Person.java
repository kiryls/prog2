package lab06;


public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override  
    public String toString() {
        return "<" + this.firstName + "," + this.lastName + ">";
    }

    public boolean equals(Object other) {
        if(other == null) return false;
        if(!(other instanceof Person)) return false;
        Person p = (Person)other;
        return (firstName.equalsIgnoreCase(p.getFirstName())) && (lastName.equalsIgnoreCase(p.getLastName()));
    }

// ritorno sulla chat

}
