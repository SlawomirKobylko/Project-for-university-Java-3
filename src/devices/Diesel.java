package devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer weight, Double cost, Double ofkoz, Integer yearOfProduction) {
        super(producer, model, weight, cost, ofkoz, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Oh no, this is not ecologic!!!");
    }
}
