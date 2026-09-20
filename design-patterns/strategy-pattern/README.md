# Strategy Design Pattern

## Overview

The Strategy Design Pattern is a behavioral design pattern that allows us to define multiple ways of performing a task and choose the required behavior at runtime.

## Real-World Example

A payment system can support multiple payment methods such as:

* UPI
* Credit Card
* Cash

Each payment method has its own implementation, while the `PaymentService` works with the common `PaymentStrategy` interface.

## UML Diagram

```text
                 <<interface>>
              PaymentStrategy
              + pay(double)
                    ▲
          ┌─────────┼─────────┐
          │         │         │
     UpiPayment CardPayment CashPayment
       +pay()      +pay()      +pay()


              PaymentService
              <<Context>>
          - paymentStrategy
          + pay(double)
                  │
                  │ uses
                  ▼
          PaymentStrategy
```

## Structure

### Strategy

`PaymentStrategy` defines the common `pay()` behavior.

### Concrete Strategies

* `UpiPayment`
* `CardPayment`
* `CashPayment`

Each class provides its own implementation of `pay()`.

### Context

`PaymentService` uses the selected `PaymentStrategy` to process the payment.

## Example

```java
PaymentService payment =
        new PaymentService(new UpiPayment());

payment.pay(500);
```

The same `PaymentService` can use another strategy:

```java
payment = new PaymentService(new CardPayment());
payment.pay(1000);
```

## Benefits

* Separates different behaviors.
* Makes the code easier to extend.
* Avoids large `if-else` or `switch` blocks.
* Allows behavior to be changed without modifying the `PaymentService`.

## Key Idea

> Strategy Pattern allows us to change a behavior without changing the class that uses that behavior.
