package devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer weight, Double cost, Double value, Integer yearOfProduction) {
        super(producer, model, weight, cost, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Range 500 kilometers");

    }
}
