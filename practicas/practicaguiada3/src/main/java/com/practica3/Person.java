package com.practica3;

public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private final int id;

    public Person() {
        this.id = 0;
    }

    public Person(String name, int age, boolean isStudent, int id) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.id = id;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                '}';
    }

    public int getId() {
        return id;
    }

    
}
