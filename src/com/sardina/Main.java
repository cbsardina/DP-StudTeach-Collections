package com.sardina;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student ryanStudent = new Student();
        ryanStudent.setFirstName("Ryan");
        ryanStudent.setLastName("Kelly");
        ryanStudent.setId(ryanStudent.makeID(ryanStudent.getLastName()));
        ryanStudent.setGrade(1);
        students.add(ryanStudent);

        Student chadStudent = new Student();
        chadStudent.setFirstName("Chad");
        chadStudent.setLastName("Yates");
        chadStudent.setId(chadStudent.makeID(chadStudent.getLastName()));
        chadStudent.setGrade(1);
        students.add(chadStudent);

        Student mattStudent = new Student();
        mattStudent.setFirstName("Matt");
        mattStudent.setLastName("LePine");
        mattStudent.setId(mattStudent.makeID(mattStudent.getLastName()));
        mattStudent.setGrade(1);
        students.add(mattStudent);

        Student alonyaStudent = new Student();
        alonyaStudent.setFirstName("Alonya");
        alonyaStudent.setLastName("Lafayette");
        alonyaStudent.setId(alonyaStudent.makeID(alonyaStudent.getLastName()));
        alonyaStudent.setGrade(1);
        students.add(alonyaStudent);

        Student brandonStudent = new Student();
        brandonStudent.setFirstName("Brandon");
        brandonStudent.setLastName("Aiton");
        brandonStudent.setId(brandonStudent.makeID(brandonStudent.getLastName()));
        brandonStudent.setGrade(1);
        students.add(brandonStudent);

        Student philStudent = new Student();
        philStudent.setFirstName("Phil");
        philStudent.setLastName("D\'Elia");
        philStudent.setId(philStudent.makeID(philStudent.getLastName()));
        philStudent.setGrade(1);
        students.add(philStudent);

        Student candaceStudent = new Student();
        candaceStudent.setFirstName("Candace");
        candaceStudent.setLastName("Moorer");
        candaceStudent.setId(candaceStudent.makeID(candaceStudent.getLastName()));
        candaceStudent.setGrade(1);
        students.add(candaceStudent);

        Student erinStudent = new Student();
        erinStudent.setFirstName("Erin");
        erinStudent.setLastName("Grady");
        erinStudent.setId(erinStudent.makeID(erinStudent.getLastName()));
        erinStudent.setGrade(1);
        students.add(erinStudent);

        Student chrisStudent = new Student();
        chrisStudent.setFirstName("Chris");
        chrisStudent.setLastName("Sardina");
        chrisStudent.setId(chrisStudent.makeID(chrisStudent.getLastName()));
        chrisStudent.setGrade(1);
        students.add(chrisStudent);

        Student joshStudent = new Student();
        joshStudent.setFirstName("Josh");
        joshStudent.setLastName("May");
        joshStudent.setId(joshStudent.makeID(joshStudent.getLastName()));
        joshStudent.setGrade(1);
        students.add(joshStudent);

        Student nickStudent = new Student();
        nickStudent.setFirstName("Nick");
        nickStudent.setLastName("Nauert");
        nickStudent.setId(nickStudent.makeID(nickStudent.getLastName()));
        nickStudent.setGrade(1);
        students.add(nickStudent);

        Student boyntonStudent = new Student();
        boyntonStudent.setFirstName("Stephen");
        boyntonStudent.setLastName("Boynton");
        boyntonStudent.setId(boyntonStudent.makeID(boyntonStudent.getLastName()));
        boyntonStudent.setGrade(1);
        students.add(boyntonStudent);

        Student crabtreeStudent = new Student();
        crabtreeStudent.setFirstName("Chad");
        crabtreeStudent.setLastName("Crabtree");
        crabtreeStudent.setId(crabtreeStudent.makeID(crabtreeStudent.getLastName()));
        crabtreeStudent.setGrade(1);
        students.add(crabtreeStudent);

        Student schoolsStudent = new Student();
        schoolsStudent.setFirstName("Stephen");
        schoolsStudent.setLastName("Schools");
        schoolsStudent.setId(schoolsStudent.makeID(schoolsStudent.getLastName()));
        schoolsStudent.setGrade(1);
        students.add(schoolsStudent);

        Student patrickStudent = new Student();
        patrickStudent.setFirstName("Patrick");
        patrickStudent.setLastName("Toomes");
        patrickStudent.setId(patrickStudent.makeID(patrickStudent.getLastName()));
        patrickStudent.setGrade(1);
        students.add(patrickStudent);

        ArrayList<Teacher> teachers = new ArrayList<>();

        Teacher calvinTeacher = new Teacher();
        calvinTeacher.setFirstName("Calvin");
        calvinTeacher.setLastName("Webster");
        calvinTeacher.setId(calvinTeacher.makeID(calvinTeacher.getLastName()));
        calvinTeacher.setGrade(1);
        teachers.add(calvinTeacher);

        Teacher bubbaTeacher = new Teacher();
        bubbaTeacher.setFirstName("Bubba");
        bubbaTeacher.setLastName("Lecheminant");
        bubbaTeacher.setId(bubbaTeacher.makeID(bubbaTeacher.getLastName()));
        bubbaTeacher.setGrade(1);
        teachers.add(bubbaTeacher);

        Teacher andreaTeacher = new Teacher();
        andreaTeacher.setFirstName("Andrea");
        andreaTeacher.setLastName("Coaker");
        andreaTeacher.setId(andreaTeacher.makeID(andreaTeacher.getLastName()));
        andreaTeacher.setGrade(1);
        teachers.add(andreaTeacher);

        Set<Student> studentSet1 = new HashSet<>();
        Set<Student> studentSet2 = new HashSet<>();
        Set<Student> studentSet3 = new HashSet<>();

        for(int i =0; i <5; i++) {
            studentSet1.add(students.get(i));
            studentSet2.add(students.get(i+5));
            studentSet3.add(students.get(i+10));
        }

        HashMap<Teacher, HashSet> hMap = new HashMap<>();

        hMap.put(andreaTeacher, (HashSet) studentSet1);
        hMap.put(bubbaTeacher, (HashSet) studentSet2);
        hMap.put(calvinTeacher, (HashSet) studentSet3);

        //for loop created 15 entries of the same 3 keys
        System.out.println("---- 3 keys for the hashmap -----");
        System.out.println(hMap.keySet());
            System.out.println(" ");

        //for loop created 15 entries of 3x5 map values
        System.out.println("----- 15 student values -----");
        System.out.println(hMap.values());
            System.out.println(" ");

        //3 keys with 5 values each
        System.out.println("----- entrySet teachers w/students -----");
        System.out.println(hMap.entrySet());
            System.out.println(" ");

        System.out.println("---- students by teacher -----");
        System.out.println("Calvin: " + hMap.get(calvinTeacher));
        System.out.println("Andrea: " + hMap.get(andreaTeacher));
        System.out.println("Bubba: " + hMap.get(bubbaTeacher));




    }
}
