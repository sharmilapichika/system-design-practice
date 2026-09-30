package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Restaurant restaurant;
    private List<FoodItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Restaurant restaurant, FoodItem foodItem) {

        if (this.restaurant == null) {
            this.restaurant = restaurant;
        }

        if (this.restaurant != restaurant) {
            System.out.println(
                    "You can add items from only one restaurant at a time."
            );
            return;
        }

        items.add(foodItem);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public double getTotalCost() {

        double total = 0;

        for (FoodItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
        restaurant = null;
    }
}