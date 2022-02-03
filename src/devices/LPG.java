package devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer weight, Double cost, Double ofkoz, Integer yearOfProduction) {
        super(producer, model, weight, cost, ofkoz, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("This fuel is expensive!");
    }
}
