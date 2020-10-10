import java.util.Arrays;

public class Animal {

    // 4 attributes
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    //no argument constructor indirectly the 4 attributes via 4 - arg constructor

    public Animal()
    {
        this("No type specified",null,0.0,0);
    }

    //the 4 - arguments indirectly accessing the 4 attributes via 4 - constructor

    public Animal(String type, String[] continents, double weight, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContinents() {
        return continents;
        //return Arrays.copyOf(continents,continents.length);
    }

    public void setContinents(String[] continents) {
        //this.continents = continents; potential breaking of encapsulation
        if(continents != null) {
            //this.continents = Arrays.copyOf(continents,continents.length);
            this.continents = Arrays.copyOf(continents,continents.length);

        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
       String str = " Animal type :" + getType();

       if(weight == 0)
           str += "\nAnimal weight : No weight specified";
       else
           str += "Animal weight : " + getWeight();

       if(age == 0)
           str += "\nAnimal age : No age specified";
       else
           str += "\nAnimal age :" + getAge();

       str += "\nAnimal contents : ";
       if(continents == null)
       {
           str += "No continent specified";
           return str;
       }
       for(int i=0; i<getContinents().length; i++)
           str += continents[i] + "";
       return str;
    }

}
