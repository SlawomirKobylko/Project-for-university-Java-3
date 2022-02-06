package com.company;

import creatures.Animal;
import devices.Car;
import java.util.Date;
import java.util.Scanner;

public class Human extends  Animal {
    private static final int GARAGE_SIZE = 4;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public  Car [] garage;
    public Double cash;    //Zadanie 8


    Human(Integer GARAGE_SIZE) {
        super("homo sapiens", 32);
        this.salary = 1200.0;
        this.garage = new Car[GARAGE_SIZE];
    }

    //Zadanie 3 i 4
    Human (Double salary, Integer age, Car car){
        super("homo sampiens", age);
        this.garage = new Car[GARAGE_SIZE];
        this.salary = salary;
    }

    private Object Date;

    Double getSalary() {
        System.out.println("aktualna data: " + new Date());
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Proszę odebrać aneks od umowy!");
            System.out.println("ZUS i US wiedzą o zmianie wypłaty. Proszę nie ukrywać zmiany dochodu.");
            this.salary = salary;
            System.out.println("Nowe wynagrodzenie: " + this.salary);
        }
        else {
            System.out.println("wynagrodzenie nieprawidłowe!");
        }
    }

    //Zadanie 5
    public Car getCar(Integer ParkingLotOfNumber){
        return this.garage[ParkingLotOfNumber];
    }

    void setCar(Car newCar, Integer ParkingLotOfNumber){
        if (this.salary > newCar.value) {
            this.garage[ParkingLotOfNumber] = newCar;
            Scanner location = new Scanner(System.in);
            System.out.println("Stać Cię na auto, możesz je kupić!");
        }
        else {
            System.out.println("Nie możesz kupić !");
            System.out.println("Do roboty!");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", pet=" + pet +
                ", garage=" + garage +
                ", Date=" + Date +
                '}';
    }

    //Zadanie 8
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Human trade it's illegal!");
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Mniam mniam, I ate "+ foodWeight + " of food");
    }

    public boolean hasCar(Car car) {
        try{
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == car) {
                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public boolean hasFreeParkingLot() {
        try {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }return false;
    }


    public void removeCar (Car car){
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public void addCar (Car car){
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                break;
            }
        }
    }

    public double totalValueOfCars () {
        double value = 0;
        for (int i = 0; i < this.garage.length; i++) {
            value += getCar(i).value;
        }
        return value;
    }

}
