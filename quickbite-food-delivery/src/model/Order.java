package model;

import payment.PaymentStrategy;

import java.util.List;

public abstract class Order {

    private static int orderCounter = 1000;

    private int orderId;
    private Customer customer;
    private Restaurant restaurant;
    private List<FoodItem> items;
    private PaymentStrategy paymentStrategy;

    public Order(Customer customer, Restaurant restaurant,
                 List<FoodItem> items, PaymentStrategy paymentStrategy) {

        this.orderId = ++orderCounter;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = items;
        this.paymentStrategy = paymentStrategy;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public double calculateTotal() {

        double total = 0;

        for (FoodItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean processPayment() {

        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
            return false;
        }

        paymentStrategy.pay(calculateTotal());
        return true;
    }

    public abstract String getOrderType();
}