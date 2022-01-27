package com.company;

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
        Car myCar = new Car();
        Human me = new Human();
        me.firstName = "Slawomir";
        me.lastName = "Kobylko";
        me.age = 25;
        me.car = myCar;
        //myCar.producer="Tesla";
        //myCar.model = "model S";

    }
}
