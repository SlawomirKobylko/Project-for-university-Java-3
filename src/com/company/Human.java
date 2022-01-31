package com.company;

import creatures.Animal;
import devices.Car;
import java.util.Date;

public class Human extends  Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public  Car car;
    public Double cash;    //Zadanie 8


    //Zadanie 3 i 4
    Human (Double salary ,Car car){
        super("homo sampiens");
        this.car = car;
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
    public Car getCar(){
        return this.car;
    }

    void setCar(Car newCar){
        if (this.salary > newCar.ofkoz) {
            this.car = newCar;
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
                ", car=" + car +
                ", Date=" + Date +
                '}';
    }

    //Zadanie 8
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Human trade it's illegal!");
    }
}
