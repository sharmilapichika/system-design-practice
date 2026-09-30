\# QuickBite – Food Delivery System



QuickBite is a Java-based food delivery application developed to practice \*\*Object-Oriented Programming (OOP)\*\* and \*\*Low-Level Design (LLD)\*\* concepts.



The project demonstrates how design patterns can be used to keep a food ordering system organized, flexible, and easy to maintain.



\## Features



\* Search restaurants by location

\* View restaurant menus

\* Add food items to a cart

\* Restrict cart items to a single restaurant

\* Calculate the total cart amount

\* Create delivery and pickup orders

\* Support multiple payment methods

\* Manage placed orders

\* Send order confirmation notifications



\## Design Patterns



\### Factory Pattern



The Factory Pattern is used to create different types of orders without directly creating the order objects in the main application.



\*\*Classes:\*\*



\* `OrderCreator`

\* `ImmediateOrderCreator`

\* `ScheduledOrderCreator`



\### Strategy Pattern



The Strategy Pattern is used to support different payment methods. The payment method can be changed without changing the order-processing logic.



\*\*Classes:\*\*



\* `PaymentStrategy`

\* `CardPayment`

\* `UpiPayment`



\### Singleton Pattern



The Singleton Pattern is used for centralized management of restaurants and orders. Each manager provides a single shared instance during the application runtime.



\*\*Classes:\*\*



\* `RestaurantManager`

\* `OrderManager`



\## Project Structure



```text

quickbite-food-delivery/

└── src/

&#x20;   ├── model/

&#x20;   │   ├── Customer.java

&#x20;   │   ├── Restaurant.java

&#x20;   │   ├── FoodItem.java

&#x20;   │   ├── Cart.java

&#x20;   │   ├── Order.java

&#x20;   │   ├── DeliveryOrder.java

&#x20;   │   └── PickupOrder.java

&#x20;   │

&#x20;   ├── factory/

&#x20;   │   ├── OrderCreator.java

&#x20;   │   ├── ImmediateOrderCreator.java

&#x20;   │   └── ScheduledOrderCreator.java

&#x20;   │

&#x20;   ├── manager/

&#x20;   │   ├── OrderManager.java

&#x20;   │   └── RestaurantManager.java

&#x20;   │

&#x20;   ├── payment/

&#x20;   │   ├── PaymentStrategy.java

&#x20;   │   ├── CardPayment.java

&#x20;   │   └── UpiPayment.java

&#x20;   │

&#x20;   ├── service/

&#x20;   │   └── NotificationService.java

&#x20;   │

&#x20;   ├── utility/

&#x20;   │   └── DateTimeUtils.java

&#x20;   │

&#x20;   ├── Main.java

&#x20;   └── QuikBiteApp.java

```



\## Application Flow



```text

Customer

&#x20;  ↓

Search Restaurant

&#x20;  ↓

Select Restaurant

&#x20;  ↓

Add Food Items

&#x20;  ↓

Cart

&#x20;  ↓

Calculate Total

&#x20;  ↓

Create Order using Factory

&#x20;  ↓

Process Payment using Strategy

&#x20;  ↓

Send Notification

&#x20;  ↓

Clear Cart

```



\## Technologies \& Concepts



\* Java

\* Object-Oriented Programming

\* Low-Level Design

\* Factory Pattern

\* Strategy Pattern

\* Singleton Pattern

\* Interfaces

\* Abstract Classes

\* Inheritance

\* Encapsulation

\* Collections



\## How to Run



1\. Clone the repository.

2\. Open the `quickbite-food-delivery` folder in IntelliJ IDEA.

3\. Make sure Java is configured.

4\. Run `Main.java`.

5\. The application demonstrates the food ordering process through the console.



\## Purpose



This project was created as part of my \*\*Low-Level Design practice\*\* to understand how common design patterns can be applied to a real-world application.



The focus is on writing simple, structured Java code while understanding the responsibilities and relationships between different classes.



