package com.eStore;

import java.util.List;

public class Cart {
    private List<CartItem> cartItems;
    private double cartTotalPrice;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cart{");
        sb.append("cartItems=").append(cartItems);
        sb.append(", cartTotalPrice=").append(cartTotalPrice);
        sb.append('}');
        return sb.toString();
    }
}
