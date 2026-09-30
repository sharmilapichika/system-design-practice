package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int id;
    private String name;
    private String location;
    private List<FoodItem> menu;

    public Restaurant(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.menu = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<FoodItem> getMenu() {
        return menu;
    }
}
