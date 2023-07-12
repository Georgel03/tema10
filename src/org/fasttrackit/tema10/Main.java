package org.fasttrackit.tema10;

import org.fasttrackit.tema10.Basket.Basket;
import org.fasttrackit.tema10.Employeers.Company;
import org.fasttrackit.tema10.Employeers.Person;
import org.fasttrackit.tema10.Flowers.Buquet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //EX 1

        Collection<String> uniqueFruits = new ArrayList<>();

        Basket basket = new Basket(null);
        basket.add("mar");
        basket.add("caisa");
        basket.add("visine");
        basket.add("caisa");
        basket.add("mar");
        basket.add("caisa");
        basket.add("caisa");
        basket.add("par");

        System.out.println(basket.find("pere"));
        System.out.println(basket.uniqueFruitsCount());
        System.out.println(basket.position("caisa"));
        System.out.println(basket.count());
        uniqueFruits = basket.distinct();
        System.out.println(uniqueFruits);

        basket.remove("caisa");
        System.out.println(basket.count());


        System.out.println("----------------------------------------------");

        //EX 2

        Buquet buquet = new Buquet(null);
        buquet.add("Lalele");
        buquet.add("Lavanda");
        buquet.add("Gladiole");
        buquet.add("Liliac");
        buquet.add("Trandafir");
        buquet.add("Lalele");
        System.out.println("All flowers are: " + buquet.getAll());
        buquet.remove("Lalele");
        System.out.println("Now we have: " + buquet.getAll());


        //Ex 3

        Company company = new Company(null, 0, null);
        Person person1 = new Person("George", 20, "Welder");
        Person person2 = new Person("Mircea", 50, "Plummer");
        Person person3 = new Person("Camelia", 45, "Manager");
        Person person4 = new Person ("Caen", 19, "Carpenter");
        Person person5 = new Person("Ruben", 18, "Carpenter");

        company.employ(person1);
        company.employ(person2);
        company.employ(person3);
        company.employ(person4);
        company.employ(person5);


        System.out.println("The new manager of the company is " + company.getManager().getName());

        List<Person> carpenter = company.getPersons("Carpenter");
        System.out.println("The people on the position of carpenters are: ");
        for (Person person : carpenter) {
            System.out.println(person.getName() + " / " + person.getAge());
        }

        System.out.println();
        List<Person> personsOlder = company.getPersonsOlder(30);
        System.out.println("The people older than 30 are ");
        for (Person person : personsOlder) {
            System.out.println(person.getName() + " / " + person.getPosition());
        }

        System.out.println();
        List<Person> specificName = company.getPerson("en");
        System.out.println("The people with the specific name are: ");
        for (Person person : specificName) {
            System.out.println(person.getName() + " / " + person.getPosition() + " / " + person.getAge());
        }


    }
}