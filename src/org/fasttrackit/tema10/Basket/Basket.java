package org.fasttrackit.tema10.Basket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
public class Basket {

    private String fruitName;

    private List<String> fruits;

    private Scanner console = new Scanner(System.in);

    public Basket(String fruitName) {

        this.fruitName = fruitName;
        this.fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {

        if (fruits.contains(fruit)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean remove(String fruit) {

        if (fruits.contains(fruit)) {

            fruits.remove(fruit);
            System.out.println(String.format("%s was successfully removed!", fruit));
            return true;
        }
        else {
            return false;
        }
    }

    public int position(String searchedFruit) {

        int pos = 0;

        System.out.print(String.format("%s was found on positions: ", searchedFruit));
        for(int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(searchedFruit)) {
                System.out.print(i + " ");
                pos = i;
            }
        }

        System.out.println();
        System.out.print("Last position of the fruit in the list: ");
        return pos;

    }

    public Collection distinct() {

        Collection<String> uniqueFruits = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            String x;
            if (!uniqueFruits.contains(fruits.get(i))){
                x = fruits.get(i);
                uniqueFruits.add(x);
            }
        }


        return uniqueFruits;

    }

    public void add(String fruit) {

        fruits.add(fruit);
        System.out.println(String.format("%s was successfully added!", fruit));

    }

    public int count() {

        return fruits.size();
    }

    public int uniqueFruitsCount() {

        int count = 0;

        for (int i = 0; i < fruits.size(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (fruits.get(i).equals(fruits.get(j))) {
                    break;
                }
            }

            if (i == j) {
                count++;
            }
        }

        return count;
    }


}
