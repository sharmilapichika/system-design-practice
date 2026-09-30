package factory;

import model.Customer;
import model.FoodItem;
import model.Order;
import model.Restaurant;
import payment.PaymentStrategy;

import java.util.List;

public interface OrderCreator {

    Order createOrder(
            Customer customer,
            Restaurant restaurant,
            List<FoodItem> items,
            PaymentStrategy paymentStrategy
    );
}
