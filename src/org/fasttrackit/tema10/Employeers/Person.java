package org.fasttrackit.tema10.Employeers;

import java.util.List;

public class Person {

    protected String name;

    protected int age;

    protected String position;

    public Person(String name, int age, String position) {

        this.age = age;
        this.name = name;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

}
