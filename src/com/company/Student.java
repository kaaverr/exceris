package com.company;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthday;
    private Integer mark;

    public Student() {
    }

    public Student(String name, LocalDate birthday, Integer mark) {
        this.name = name;
        this.birthday = birthday;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student: " +
                " name = " + name  +
                " birthday = " + birthday +
                " , mark = " + mark
                ;
    }


}
