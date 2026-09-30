import factory.ImmediateOrderCreator;
import factory.OrderCreator;
import manager.OrderManager;
import manager.RestaurantManager;
import model.Customer;
import model.FoodItem;
import model.Order;
import model.Restaurant;
import payment.CardPayment;
import payment.PaymentStrategy;
import service.NotificationService;

import java.util.List;

public class QuikBiteApp {

    public static void run() {

        // Create customer
        Customer customer =
                new Customer(1, "Sharmila", "9876543210");

        // Add restaurants
        initializeRestaurants();

        // Get restaurant manager
        RestaurantManager restaurantManager =
                RestaurantManager.getInstance();

        // Search restaurants
        List<Restaurant> restaurants =
                restaurantManager.searchByLocation("Bhimavaram");

        System.out.println("Restaurants in Bhimavaram:");

        for (Restaurant restaurant : restaurants) {
            System.out.println(
                    restaurant.getId() + " - " +
                            restaurant.getName()
            );
        }

        // Select restaurant
        Restaurant restaurant =
                restaurantManager.findRestaurant(101);



        // Add food items to cart
        FoodItem biryani =
                restaurant.getMenu().get(0);

        FoodItem noodles =
                restaurant.getMenu().get(1);

        customer.getCart().addItem(restaurant,biryani);
        customer.getCart().addItem(restaurant,noodles);

        // Display cart
        printCart(customer);

        // Choose payment method
        PaymentStrategy payment =
                new CardPayment();

        // Choose order creator
        OrderCreator orderCreator =
                new ImmediateOrderCreator();

        // Create order
        Order order = orderCreator.createOrder(
                customer,
                restaurant,
                customer.getCart().getItems(),
                payment
        );

        // Store order
        OrderManager orderManager =
                OrderManager.getInstance();

        orderManager.addOrder(order);

        // Process payment
        if (order.processPayment()) {

            NotificationService notificationService =
                    new NotificationService();

            notificationService.notifyCustomer(order);

            customer.getCart().clear();

            System.out.println("Cart cleared successfully.");
        }
    }

    private static void initializeRestaurants() {

        Restaurant spiceHub =
                new Restaurant(101, "Spice Hub", "Bhimavaram");

        spiceHub.addFoodItem(
                new FoodItem(1, "Chicken Biryani", 220)
        );

        spiceHub.addFoodItem(
                new FoodItem(2, "Veg Noodles", 150)
        );

        Restaurant foodCorner =
                new Restaurant(102, "Food Corner", "Bhimavaram");

        foodCorner.addFoodItem(
                new FoodItem(3, "Paneer Rice", 180)
        );

        foodCorner.addFoodItem(
                new FoodItem(4, "Fried Rice", 140)
        );

        RestaurantManager restaurantManager =
                RestaurantManager.getInstance();

        restaurantManager.addRestaurant(spiceHub);
        restaurantManager.addRestaurant(foodCorner);
    }

    private static void printCart(Customer customer) {

        System.out.println();
        System.out.println("----- Your Cart -----");

        for (FoodItem item : customer.getCart().getItems()) {

            System.out.println(
                    item.getName() + " - ₹" +
                            item.getPrice()
            );
        }

        System.out.println(
                "Total: ₹" +
                        customer.getCart().getTotalCost()
        );

        System.out.println("---------------------");
    }
}