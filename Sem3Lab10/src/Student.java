import java.util.*;
import java.text.*;

public abstract class Student implements InterfacePerson {

    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String studentID;
    private String course;

    public Student()
    {
        this("Undefined","Undefined",null,"Undefined","Undefined");
    }

    public Student(String name, String address, GregorianCalendar dateOfBirth, String studentID, String course)
    {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStudentID(studentID);
        setCourse(course);

    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
