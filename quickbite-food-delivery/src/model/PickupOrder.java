package model;

import payment.PaymentStrategy;

import java.util.List;

public class PickupOrder extends Order {

    private String pickupTime;

    public PickupOrder(Customer customer,
                       Restaurant restaurant,
                       List<FoodItem> items,
                       PaymentStrategy paymentStrategy,
                       String pickupTime) {

        super(customer, restaurant, items, paymentStrategy);

        this.pickupTime = pickupTime;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    @Override
    public String getOrderType() {
        return "Pickup";
    }
}
