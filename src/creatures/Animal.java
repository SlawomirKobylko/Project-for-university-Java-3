package creatures;

import com.company.Human;
import com.company.Salleable;

public class Animal implements Salleable {
    final public String species; //zadanie 1
    public String name;
    public Integer age;
    public Boolean alive;
    private Double weight; //zadanie 1

    public Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 12.0;
        } else if (this.species == "felis") {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
    }

    public void introduceYourself()
    {
        System.out.println("I'm "+ this.name);
    }
    public void doYouLike(String foodType)
    {
        if (this.species == "felis"&&foodType=="mouse")
            System.out.println("yes, I like "+ foodType);
        else
        {
            System.out.println("no ypu idiot");
        }
    }

    public void feed()
    {
        if (!this.alive || this.weight <=0)
        {
            System.out.println("This animal is dead, " +
                    "It's don't have food");
        }
        else
        {this.weight++;
            System.out.println("The animal was taken for a walk");
            System.out.println("Weight this animal = "+ this.weight+ " kg");
        }
    }

    public void takeForWalk()
    {
        this.weight-=1;
        if (this.weight<=0.0)
        {
            this.alive=false;
            System.out.println("This animal is dead, " +
                    "It's don't take for walk");
        }
        else if (this.weight > 0.0)
        {
            this.alive=true;
            System.out.println("This weight of the animal was reduced to "+ this.weight + " kg");
        }

    }

    //Zadanie 6
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                ", weight=" + weight +
                '}';
    }

    //Zadanie 8
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (this instanceof Human) {
            System.out.println("You can't sell people");
        } else if (species == "homo sapiens") {
            System.out.println("Human trade it's illegal!");
        } else if (buyer.cash < price) {
            System.out.println("The buyer have a too little money");
        } else if (seller.pet == null) {
            System.out.println("The seller don't have any animal");
        } else if (!seller.pet.equals(this)) {
            System.out.println("The seller don't have this animal");
        } else if (!seller.pet.equals(this.alive)) {
            System.out.println("This animal is ded, you don't have buy this animal");
        }
        else {
            buyer.cash += price;
            seller.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Successful transaction, bought" + this);
        }
    }
}
