package factory;

import model.Customer;
import model.DeliveryOrder;
import model.FoodItem;
import model.Order;
import model.Restaurant;
import payment.PaymentStrategy;

import java.util.List;

public class ImmediateOrderCreator implements OrderCreator {

    @Override
    public Order createOrder(
            Customer customer,
            Restaurant restaurant,
            List<FoodItem> items,
            PaymentStrategy paymentStrategy) {

        return new DeliveryOrder(
                customer,
                restaurant,
                items,
                paymentStrategy,
                "Customer Address"
        );
    }
}
