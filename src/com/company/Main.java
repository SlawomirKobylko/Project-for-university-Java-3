package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        //Zadanie 2
        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");
        cat.alive = true;
        cat.name = "kitek";
        cat.age = 3;
        dog.age = 4;
        dog.doYouLike("meet");
        dog.introduceYourself();
        cat.introduceYourself();
        cat.introduceYourself();
        cat.doYouLike("cheese");
        cat.doYouLike("mouse");

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
        Car myCar = new Car("Tesla","model S", 1500, 95000.50,85000.00, 2020);
        Human me = new Human(1480.90, myCar);
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
        Car otherCar = new Car
                ("Tesla","model S",1500,95000.50,85000.50, 2020);
        Car anotherCar = otherCar;
        System.out.println(cat);
        System.out.println(otherCar==myCar);
        System.out.println(myCar.equals(otherCar));
        System.out.println(otherCar.equals(anotherCar));
        System.out.println(cat.hashCode());
        System.out.println(myCar.hashCode());
        System.out.println(anotherCar.hashCode());
        System.out.println(otherCar.hashCode());

        System.out.println(cat);
        System.out.println(myCar);
        System.out.println(me);

        //Zadanie 7
        Phone myPhone = new Phone
                ("Samsung", "Galaxy",2022, 6.7, "Android 10",2020);
        System.out.println(myPhone);

        myPhone.turnOn();
        myCar.turnOn();
    }
}
