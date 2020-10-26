public class TestPolymorphism {
    public static void main(String[] args) {

       Employee[] employees = new Employee[3];

       Boss b1 = new Boss("Joe "," Smith",750.50);
       HourlyWorker hw1 = new HourlyWorker("Marry ","O'Neill",8.5,49.5);

       employees[0] = b1;
       employees[1] = hw1;

       SelfEmployedWorker selfEmp = new SelfEmployedWorker("Richard ","Branson");
       employees[2] = selfEmp;

       for(int i=0; i<employees.length; i++)
           System.out.println(employees[i].toString() + " and the earnings were " + String.format("%.2f",employees[i].earnings()) + "\n");
    }
}
