// Product
interface Notification {
    void send(String message);
}

// Concrete Product
class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

// Factory
class NotificationFactory {

    public Notification createNotification(String type) {

        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }

        if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }

        return null;
    }
}

// Main
public class FactoryMethodDesignPattern {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification notification =
                factory.createNotification("email");

        notification.send("Welcome to our application!");

        notification =
                factory.createNotification("sms");

        notification.send("Your OTP is 1234");

        notification =
                factory.createNotification("push");

        notification.send("You have a new message!");
    }
}
