public class ComputerObject {

   private String manufacture;
   private String type;
   private double speed;
   private int ram;
   private double price;

   public ComputerObject()
   {
       manufacture = "Not Available";
       type = "Not Available";
       speed = 0;
       ram = 0;
       price = 0;
   }

   public ComputerObject(String manufacture, String type, double speed, int ram, double price)
   {
       this.manufacture = manufacture;
       this.type = type;
       this.speed = speed;
       this.ram = ram;
       this.price = price;
   }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
         if(speed > 0)
             this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
       if(ram > 0)
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price > 0)
        this.price = price;
    }

    public String toString()
    {
        return " Manufacturer " + getManufacture() + " Type " + getType() + " Speed " + getSpeed() + " Ram " + getRam() + " Price " + getPrice();
    }


}
