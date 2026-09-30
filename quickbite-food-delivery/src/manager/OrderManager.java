package manager;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private static OrderManager instance;

    private List<Order> orders;

    private OrderManager() {
        orders = new ArrayList<>();
    }

    public static OrderManager getInstance() {

        if (instance == null) {
            instance = new OrderManager();
        }

        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrder(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {
                return order;
            }
        }

        return null;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
