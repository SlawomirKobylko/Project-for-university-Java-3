package devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer weight, Double cost, Double value, Integer yearOfProduction) {
        super(producer, model, weight, cost, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("This fuel is expensive!");
    }
}
