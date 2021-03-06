public class Department {

    private String name;
    private Student[] students;

    public Department(String name, Student[] students)
    {
        setName(name);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public String toString()
    {
        String str = "\nName: " + getName() + "\nStudent List: \n\n";

        for(int i=0; i<getStudents().length; i++)
            if(students[i] != null)
                str += students[i];

            return str;
    }
}
