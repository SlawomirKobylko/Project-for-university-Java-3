package devices;

//Zadanie 7
public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    final public Double value;

    public Device(String producer, String model, Integer yearOfProduction, Double value){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
