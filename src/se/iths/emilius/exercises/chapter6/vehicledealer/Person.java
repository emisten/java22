package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class Person {
    private String name;
    private int age;
    private String work;
    private BigDecimal accountBalance;


    public Person(String name, int age, String work, BigDecimal accountBalance) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}

