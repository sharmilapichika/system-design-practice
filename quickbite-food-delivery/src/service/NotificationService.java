package service;

import model.Order;

public class NotificationService {

    public void notifyCustomer(Order order) {

        System.out.println();
        System.out.println("----- QuickBite Notification -----");
        System.out.println("Order #" + order.getOrderId() + " placed successfully.");
        System.out.println("Restaurant: " + order.getRestaurant().getName());
        System.out.println("Order Type: " + order.getOrderType());
        System.out.println("Total Amount: ₹" + order.calculateTotal());
        System.out.println("----------------------------------");
    }
}