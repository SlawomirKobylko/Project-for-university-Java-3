package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.Car;
import devices.Electric;
import devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        //Zadanie 2
        Integer x = 3;
        Pet dog = new Pet("canis", "reksio", 4);
        Pet cat = new Pet("felis", "kitek", 3);
        FarmAnimal cow = new FarmAnimal("cow", "krasula", 6);
        cat.alive = true;
        //cat.name = "kitek";
        //cat.age = 3;
        //dog.age = 4;
        dog.doYouLike("meet");
        dog.introduceYourself();
        cat.introduceYourself();
        cat.introduceYourself();
        cat.doYouLike("cheese");
        cat.doYouLike("mouse");

        //dog.name = "Szarik";
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
        Electric myCar = new Electric("Tesla","model S", 1500, 95000.50,85000.00, 2020);
        Human me = new Human(1480.90, 25, myCar);
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
        Electric otherCar = new Electric
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

        //Zadanie 8
        me.cash = 10000.80;
        me.pet = cat;
        Human you = new Human(5000.50,30, otherCar);
        Human politic = new Human (25000.90,70, anotherCar);
        politic.cash = 100000.90;
        you.cash = 13000.30;
        myCar.sale(me, you, 4000.90);
        anotherCar.sale(you, me, 109.90);
        you.sale(me, politic, 1.1);
        cat.sale(you, me, 100.20);
        cat.sale(me, you, 100.30);

        //Zadanie 9
        me.pet.feed();
        me.pet.feed(4.5);
        Pet kitty = new Pet("Alley Cat", "Kitty", 2);
        kitty.feed(0.5);
        kitty.feed();
        FarmAnimal cattle = new FarmAnimal("cattle", "milka", 5);
        cow.feed(0.1);
        cow.feed();
        cow.beEaten();
        kitty.feed();
        kitty.feed(3.3);

        //Zadanie 10
        otherCar.refuel();
        myCar.refuel();
        anotherCar.refuel();

        URL url = new URL("https://www.google.com/");

        myPhone.installAnApp(url);
    }
}
