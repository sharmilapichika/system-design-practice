// Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy
class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

// Context
class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}

// Main
public class StrategyDesignPattern {
    public static void main(String[] args) {

        PaymentService payment =
                new PaymentService(new UpiPayment());

        payment.pay(500);

        payment = new PaymentService(new CardPayment());
        payment.pay(1000);

        payment = new PaymentService(new CashPayment());
        payment.pay(300);
    }
}
