package manager;

import model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager instance;

    private List<Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {

        if (instance == null) {
            instance = new RestaurantManager();
        }

        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String location) {

        List<Restaurant> result = new ArrayList<>();

        for (Restaurant restaurant : restaurants) {

            if (restaurant.getLocation().equalsIgnoreCase(location)) {
                result.add(restaurant);
            }
        }

        return result;
    }

    public Restaurant findRestaurant(int restaurantId) {

        for (Restaurant restaurant : restaurants) {

            if (restaurant.getId() == restaurantId) {
                return restaurant;
            }
        }

        return null;
    }
}
