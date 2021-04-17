package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == array[i + 1]){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = { 1 , 4 , 2 , 6 , 5 , 5 , 5 , 3 , 3 , 3 , 2 , 4 , 11};
        //System.out.println(hasDuplicates(array));

        Student john = new Student("John" , LocalDate.of(2009 , 6 , 07 ) , 85);
        Student derrick = new Student("Derrick" , LocalDate.of(2001 , 6 , 27 ) , 95);
        Student ethan  = new Student("Ethan" , LocalDate.of(1992 , 2 , 29 ) , 55);
        Student william = new Student("William" , LocalDate.of(1975 , 11 , 14 ) , 25);
        Student george = new Student("George" , LocalDate.of(1987 , 7 , 17 ) , 62);

        List<Student> students = new ArrayList<>();
        students.add(john);
        students.add(derrick);
        students.add(ethan);
        students.add(william);
        students.add(george);
        //System.out.println(students);

        for (Student student: students){
            //System.out.println(student);
            //if (student.getBirthday().getYear() > 2003) System.out.println(student.getName());
        }

        students.stream().filter(student -> student.getMark() > 80)
                .forEach(System.out::println);

        System.out.println(students.stream().filter(el -> el.getMark() > 80).count());

        System.out.println(students.stream().max(Comparator.comparing(student -> student.getMark())));

        System.out.println(students.stream().mapToInt(student -> student.getMark()).max().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).min().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).sum());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).average().getAsDouble());
        System.out.println(students.stream().count());
        System.out.println(" ");

        PartTimeEmployer ivan = new PartTimeEmployer("Ivan" , 20 , 8 );
        FullTimeEmployer vasya = new FullTimeEmployer("Vasya" , 2 , 15 , "coder");

        List<IAccounting> workers = new ArrayList<>();
        workers.add(ivan);
        workers.add(vasya);

    }
}
