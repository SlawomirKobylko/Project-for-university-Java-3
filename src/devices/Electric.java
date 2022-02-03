package devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer weight, Double cost, Double ofkoz, Integer yearOfProduction) {
        super(producer, model, weight, cost, ofkoz, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Range 500 kilometers");

    }
}
