public class Bicycle extends Vehicle {
    private boolean hasABell;
    private int gearCount;

    public Bicycle()
    {
        setHasABell(false);
        setGearCount(0);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, boolean hasABell,int gearCount)
    {
        super(price, length, height, weight, manufacturer, model);
        setHasABell(hasABell);
        setGearCount(gearCount);
    }

    public boolean isHasABell() {
        return hasABell;
    }

    public void setHasABell(boolean hasABell) {
        hasABell = hasABell;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        gearCount = gearCount;
    }
    public String toString()
    {
        String str = super.toString() + "\nHas bell: ";

        if(isHasABell())
            str += "Yes";
        else
            str += "No";

        str += "\nGear Count: " + getGearCount();

        return str;
    }
}
