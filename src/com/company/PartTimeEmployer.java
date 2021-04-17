package com.company;

public class PartTimeEmployer  implements IAccounting{

    private String name;
    private Integer rate;
    private Integer hours;

    public PartTimeEmployer() {
    }

    public PartTimeEmployer(String name, Integer rate, Integer hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployer{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    @Override
    public int getSalary() {
        return this.getHours() * this.getRate();
    }
}

