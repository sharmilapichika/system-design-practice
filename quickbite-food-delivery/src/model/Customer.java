package model;

public class Customer {

    private int id;
    private String name;
    private String phoneNumber;
    private Cart cart;

    public Customer(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cart = new Cart();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Cart getCart() {
        return cart;
    }
}

