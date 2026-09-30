package factory;

import model.Customer;
import model.FoodItem;
import model.Order;
import model.PickupOrder;
import model.Restaurant;
import payment.PaymentStrategy;

import java.util.List;

public class ScheduledOrderCreator implements OrderCreator {

    private String pickupTime;

    public ScheduledOrderCreator(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    @Override
    public Order createOrder(
            Customer customer,
            Restaurant restaurant,
            List<FoodItem> items,
            PaymentStrategy paymentStrategy) {

        return new PickupOrder(
                customer,
                restaurant,
                items,
                paymentStrategy,
                pickupTime
        );
    }
}
