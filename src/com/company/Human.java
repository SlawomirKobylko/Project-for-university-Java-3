package com.company;
import java.time.LocalDate;
import java.util.GregorianCalendar;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;

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

}
