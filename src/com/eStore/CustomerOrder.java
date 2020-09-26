package com.eStore;

import java.sql.Date;
import java.util.List;

public class CustomerOrder {
    private double totalPrice;
    private Date orderDate;
    private String status;
    private Customer customer;
    private List<CartItem> cartItems;
}
