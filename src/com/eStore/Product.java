package com.eStore;


public class Product {
    private Integer productId;
    private String productName;
    private Category category;
    private String description;
    private double price;
    private int quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", category=").append(category);
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public Product addProduct(){
        Product newProduct = new Product();
        newProduct.setProductId(1);
        newProduct.setProductName("headset");
        newProduct.setPrice(4000.00);
        newProduct.setCategory(Category.PHONE_ACCESSORIES);
        newProduct.setDescription("The best headset east of Niger");
        newProduct.setQuantity(50);
        return newProduct;
    }


}
