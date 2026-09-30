package model;

import payment.PaymentStrategy;

import java.util.List;

public class DeliveryOrder extends Order {

    private String deliveryAddress;

    public DeliveryOrder(Customer customer,
                         Restaurant restaurant,
                         List<FoodItem> items,
                         PaymentStrategy paymentStrategy,
                         String deliveryAddress) {

        super(customer, restaurant, items, paymentStrategy);

        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String getOrderType() {
        return "Delivery";
    }
}