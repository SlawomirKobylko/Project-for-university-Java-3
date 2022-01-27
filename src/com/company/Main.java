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
    }
}
