public class Institute {

    private String InstituteName;
    private Department[] departments;

    public Institute(String InstituteName, Department[] departments)
    {
        setInstituteName(InstituteName);
        setDepartment(departments);
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public void setInstituteName(String InstituteName) {
        this.InstituteName = InstituteName;
    }

    public Department[] getDepartment() {
        return departments;
    }

    public void setDepartment(Department department[]) {
        this.departments = department;
    }

    public String toString()
    {
       String str = "Name: " + getInstituteName() + "\nDepartments: ";

       for(int i=0; i<getDepartment().length; i++)
           if(departments[i] != null)
               str += departments[i];

           return str;
    }

    public int getTotalStudents()
    {
        int numberOfStudents = 0;
        Student[] students;

        for(int i=0; i<departments.length; i++)
        {
            if(departments[i] != null)
            {
                students = departments[i].getStudents();

                for(int j=0; j<students.length; j++)
                {
                    if(students[j] != null)
                        numberOfStudents++;
                }
            }
        }
        return numberOfStudents;
    }


}
