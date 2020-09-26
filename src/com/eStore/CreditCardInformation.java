package com.eStore;

import java.time.YearMonth;

public class CreditCardInformation {
    private YearMonth cardExpirationYearMonth;
    private String creditCardNumber;
    private String cardCvv;
    private CardType cardType;
    private String nameOnCard;

    public YearMonth getCardExpirationYearMonth() {
        return cardExpirationYearMonth;
    }

    public void setCardExpirationYearMonth(YearMonth cardExpirationYearMonth) {
        this.cardExpirationYearMonth = cardExpirationYearMonth;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditCardInformation{");
        sb.append("cardExpirationYearMonth=").append(cardExpirationYearMonth);
        sb.append(", creditCardNumber='").append(creditCardNumber).append('\'');
        sb.append(", cardCvv='").append(cardCvv).append('\'');
        sb.append(", cardType=").append(cardType);
        sb.append(", nameOnCard='").append(nameOnCard).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
