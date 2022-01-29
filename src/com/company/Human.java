package com.company;
import devices.Car;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    Human(Car car){
        this.car = car;
    }

    //Zadanie 3 i 4
    Human (){
        this.salary = 1200.00;
    }

    private Object Date;

    Double getSalary() {
        System.out.println("aktualna data: " + new Date());
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }

    void setSalary(Double salary) {
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
    Car getCar(){
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
}
