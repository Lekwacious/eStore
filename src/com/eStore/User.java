package com.eStore;

public abstract class User {
    private String name;
    private String password;
    private String emailAddress;
    private String phone;
    private Address homeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", homeAddress=").append(homeAddress);
        sb.append('}');
        return sb.toString();
    }
    public abstract User registerUser();
}
