package com.eStore;

import java.util.List;

public class Store {
    private String storeName;
    private List<User> registeredUsers;
    private List<Product> products;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Store{");
        sb.append("storeName='").append(storeName).append('\'');
        sb.append(", registeredUsers=").append(registeredUsers);
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
