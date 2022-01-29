package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        //Zadanie 1
        System.out.println(dog.name);
        cat.feed();
        cat.feed();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed();
        cat.feed();
        cat.takeForWalk();

        //Zadanie 2
        Car myCar = new Car("Tesla","model S", 1500, 95000.50,85000.00);
        Human me = new Human(myCar);
        me.firstName = "Slawomir";
        me.lastName = "Kobylko";
        me.age = 25;

        //Zadanie 3 i 4
        me.getSalary();
        me.setSalary(1400.5);
        me.getSalary();

        //Zadanie 5
        me.setCar(myCar);
        me.getCar();

        //Zadanie 6
        Car otherCar = new Car("Tesla","model S",1500,95000.50,85000.50);
        Car anotherCar = otherCar;
        System.out.println(cat);
        System.out.println(otherCar==myCar);
        System.out.println(myCar.equals(otherCar));
        System.out.println(otherCar.equals(anotherCar));
        System.out.println(cat.hashCode());
        System.out.println(myCar.hashCode());
        System.out.println(anotherCar.hashCode());
        System.out.println(otherCar.hashCode());
    }
}
