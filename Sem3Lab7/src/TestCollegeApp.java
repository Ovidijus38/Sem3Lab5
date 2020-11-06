import java.lang.instrument.Instrumentation;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student[] computingStudents = new Student[10];

        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student[] creativeMediaStudents = new Student[10];

        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department computingDept = new Department("Computing",computingStudents);
        Department creativeMediaDept = new Department("Creative Media",creativeMediaStudents);

        Department[] allDepts = new Department[5];

        allDepts[0] = computingDept;
        allDepts[1] = creativeMediaDept;

        Institute itt = new Institute("Institute of Technology, Tralee",allDepts);

        System.out.println(itt);

        System.out.println("Total students in institute: ");
        System.out.println(itt.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        int mediaSub = -1, compSub = -1;

        for(int i=0; i<allDepts.length; i++)
        {
            if(allDepts[i] != null && allDepts[i].getName().equals("Creative Media"))
                mediaSub++;

            if(allDepts[i] != null && allDepts[i].getName().equals("Computing"))
                compSub++;
        }
        if(mediaSub !=-1 && compSub !=-1)
        {
            Student[] allDepStudents = allDepts[compSub].getStudents();

            int x;

            for(x=0; x<allDepStudents.length; x++)
            {
                if(allDepStudents[x] != null)
                {
                    if(allDepStudents[x].getId() == 154345)
                    {
                        System.out.println("\n\nWe found Jake !!!");

                        allDepStudents[x].setDepartment("Creative Media");

                        allDepts[mediaSub].getStudents()[2] = allDepStudents[x];
                        allDepStudents[x] = null;

                        break;   // do i need break here?
                    }
                }
            }
            if(x == allDepStudents.length)
                System.out.println("\nNo Jake in here !!!");
        }
        System.out.println(itt);


      /*  creativeMediaStudents[2] = student1;
        student1.setDepartment("Creative Media");
        computingStudents[0] = null;

        if(creativeMediaStudents[2] != student1)
            System.out.println("Jack is not here !!!");
        else
            System.out.println("We found Jack !!!");
     */



    }
}
