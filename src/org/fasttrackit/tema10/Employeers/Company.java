package org.fasttrackit.tema10.Employeers;

import java.util.ArrayList;
import java.util.List;


public class Company extends Person{

    private List<Person> persons;
    public Company(String name, int age, String position) {
        super(name, age, position);
        this.persons = new ArrayList<>();
    }

    public Person getManager() {

        for (Person person : persons) {
            if (person.getPosition().equals("manager") || person.getPosition().equals("Manager")
            || person.getPosition().equals("MANAGER")) {
                return person;
            }
        }

        return null;
    }

    public List<Person> getPersons(String profession) {

        List<Person> newList = new ArrayList<>();

        for (Person person : persons) {

            if (person.getPosition().equals(profession)) {

                newList.add(person);
            }
        }

        return newList;
    }

    public List<Person> getPersonsOlder(int age) {

        List<Person> newList = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() > age) {
                newList.add(person);
            }
        }

        return newList;
    }

    public List<Person> getPerson(String filterName) {

        List<Person> newList = new ArrayList<>();

        for (Person person : persons) {
            if (person.getName().contains(filterName)) {
                newList.add(person);
            }
        }

        return newList;
    }

    public void employ(Person employee) {

        for (Person person : persons) {
            if (person.getName().equals(employee.getName()) && person.getAge() == employee.getAge() &&
            person.getPosition().equals(employee.getPosition())) {

                System.out.println("The person is already employeed!");
                return;
            }

        }

        persons.add(employee);
        System.out.println(String.format("%s has been employeed, on the position %s, have %d years old!",
                employee.getName(), employee.getPosition(), employee.getAge()));
    }
}
