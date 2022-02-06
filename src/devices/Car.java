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


    //Zadanie 7
    public Car(String producer, String model, Integer weight, Double cost, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, value);
        this.weight = weight;
        this.cost = cost;
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
                ", ofkoz=" + value +
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
            if (producer.equals(obj.producer) && model.equals(obj.model) && weight == obj.weight && cost == obj.cost && value.equals(obj.value)) {
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
        result = 31 * result + value.hashCode();
        return result;

    }

    //Zadanie 8
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("The buyer has too little money");
        } else if (!buyer.hasFreeParkingLot()){
            System.out.println("Lack of space at the buyer");
        } else if (!seller.hasCar(this)) {
            System.out.println("The seller does not have any car");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Successful transaction, bought" + this);
        }

    }

    //Zadanie 10
    abstract public void refuel();


    //Zadanie 11
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Kupujący nie ma pieniędzy na nowe auto.");
        } else if (!seller.hasCar(this)) {
            System.out.println("Sprzedający nie ma auta na sprzedaż.");
        } else if (!buyer.hasFreeParkingLot()) {
            System.out.println("Kupujący nie mia miejsca an nowe auto");
        } else {
            //wymiana kasy
            seller.cash += price;
            buyer.cash -= price;
            //wymiana samochodów
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Transakcja się udała, kupiono " + this);
        }
    }
}
