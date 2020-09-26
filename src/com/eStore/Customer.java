package com.eStore;

public class Customer extends User {
    private BillingInformation billingInformation;

    public BillingInformation getBillingInformation() {
        return billingInformation;
    }

    public void setBillingInformation(BillingInformation billingInformation) {
        this.billingInformation = billingInformation;
    }

    @Override
    public Customer registerUser() {
        Address newAddress = new Address("12", "Adewumi street", "Yaba", "Lagos", "Nigeria");
        Customer customer = new Customer();
        customer.setName("Eme");
        customer.setEmailAddress("emelekwa@gmail.com");
        customer.setHomeAddress(newAddress);
        return customer;
    }
}
