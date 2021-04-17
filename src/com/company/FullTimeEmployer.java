package com.company;

public class FullTimeEmployer implements IAccounting {
    private String name;
    private Integer experience;
    private Integer rate;
    private String speciality;

    public FullTimeEmployer() {
    }

    public FullTimeEmployer(String name, Integer experience, Integer rate, String speciality) {
        this.name = name;
        this.experience = experience;
        this.rate = rate;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "FullTimeEmployer{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", rate=" + rate +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public int getSalary() {

        return 22 * 8 * this.getRate();
    }
}
