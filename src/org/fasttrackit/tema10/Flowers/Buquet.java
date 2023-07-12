package org.fasttrackit.tema10.Flowers;
import java.util.ArrayList;
import java.util.Collection;

public class Buquet {

    private String nameOfFlower;

    private Collection<String> flowers;

    public Buquet(String nameOfFlower) {

        this.nameOfFlower = nameOfFlower;
        this.flowers = new ArrayList<>();
    }

    public Collection getAll() {
        return flowers;
    }

    public void add(String flower) {

        if (flowers.contains(flower)) {
            System.out.println(String.format("%s is already in the buquet!", flower));
        }
        else {
            flowers.add(flower);
            System.out.println(String.format("%s has been added!", flower));
        }
    }

    public void remove(String flower) {

        if (!flowers.contains(flower)) {
            System.out.println(String.format("%s cannot be deleted!", flower));
        }
        else {
            flowers.remove(flower);
            System.out.println(String.format("%s has been deleted!", flower));
        }
    }
}
