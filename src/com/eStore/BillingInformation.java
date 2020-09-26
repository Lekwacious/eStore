package com.eStore;

public class BillingInformation {
    private String receiver;
    private CreditCardInformation creditCardInformation;
    private String receiverPhoneNumber;
    private Address deliveryAddress;

    public BillingInformation(String receiver, CreditCardInformation creditCardInformation, String receiverPhoneNumber, Address deliveryAddress) {
        this.receiver = receiver;
        this.creditCardInformation = creditCardInformation;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.deliveryAddress = deliveryAddress;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BillingInformation{");
        sb.append("receiver='").append(receiver).append('\'');
        sb.append(", creditCardInformation=").append(creditCardInformation);
        sb.append(", receiverPhoneNumber='").append(receiverPhoneNumber).append('\'');
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append('}');
        return sb.toString();
    }
}
