package devices;

import java.util.Objects;
import com.company.Salleable;
import com.company.Human;

public abstract class Car extends Device implements Salleable {
    //zadanie 2
    //final String model;
    //final String producer;
    public Integer weight;
    public Double cost;
    public Double ofkoz;


    //Zadanie 7
    public Car(String producer, String model, Integer weight, Double cost, Double ofkoz, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.weight = weight;
        this.cost = cost;
        this.ofkoz = ofkoz;
    }

    @Override
    public void turnOn() {
        System.out.println("I turn the key");
    }

    /*public Car (String producer, String model, Integer weight, Double cost, Double ofkoz){
        this.producer = producer;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
        this.ofkoz = ofkoz;
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfproduction=" + yearOfProduction +
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
            Car obj = (Car) object;
            if (producer.equals(obj.producer) && model.equals(obj.model) && weight == obj.weight && cost == obj.cost && ofkoz.equals(obj.ofkoz)) {
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

    //Zadanie 8
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("The buyer has too little money");
        } else if (!seller.getCar().equals(this)){
            System.out.println("The seller does not this car");
        } else if (seller.getCar() == null) {
            System.out.println("The seller does not own the car");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Successful transaction, bought" + this);
        }

    }

    //Zadanie 10
    abstract public void refuel();
}
