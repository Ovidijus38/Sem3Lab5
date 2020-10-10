public class Person {
    private String firstName;
    private String lastName;

    public Person()
    {
        this("Not Supplied","Not Supplied");
    }
    public Person(String firstName, String lastName)
    {
        setName(firstName, lastName);
    }

    public void setName(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString()
    {
        return "First name : " + getFirstName() + "    " + "Last name : " + getLastName();
    }
}
