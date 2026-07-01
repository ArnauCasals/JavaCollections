package javaCollections.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Can Joan", 5));
        restaurants.add(new Restaurant("Can Joan", 5)); // Duplicate
        restaurants.add(new Restaurant("Can Joan", 4)); // Same name, different rating
        restaurants.add(new Restaurant("La Brasa", 5));
        restaurants.add(new Restaurant("La Brasa", 3));

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}