package com.company;

public class Animal {
    final String species; //zadanie 1
    String name;
    Integer age;
    Boolean alive;
    private Double weight; //zadanie 1

    Animal(String species) {
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

    void feed()
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

    void takeForWalk()
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
}
