package devices;

import java.util.Objects;

public class Car {
    //zadanie 2
    final String model;
    final String producer;
    Integer weight;
    Double cost;
    public Double ofkoz;

    public Car (String producer, String model, Integer weight, Double cost, Double ofkoz){
        this.producer = producer;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
        this.ofkoz = ofkoz;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", ofkoz=" + ofkoz +
                '}';
    }

    //Zadanie 6
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Car) {
            Car o = (Car) object;
            if (producer.equals(o.producer) && model.equals(o.model) && weight == o.weight && cost == o.cost && ofkoz.equals(o.ofkoz)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + producer.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + weight;
        result = 31 * result + cost.hashCode();
        result = 31 * result + ofkoz.hashCode();
        return result;

    }

}
