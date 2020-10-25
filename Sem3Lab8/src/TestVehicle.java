

public class TestVehicle {
    public static void main(String[] args) {

        System.out.println("\n\nTesting the Car no-arg constructor: ");
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println("\n\nTesting the car multi-arg constructor: ");
        Car car2 = new Car(10000,4.5,1.25,2000,"Ferrari","F2",2,"05-KY-1");
        System.out.println(car2);

        System.out.println("\n\nTesting the bicycle no-arg constructor: ");
        Bicycle bike1 = new Bicycle();
        System.out.println(bike1);

        System.out.println("\n\nTesting the bicycle multi-arg constructor: ");
        Bicycle bike2 = new Bicycle(500,1.5,1,50,"Giant","RoadBike",true,4);
        System.out.println(bike2);
    }
}
