package com.neha.foodiecliapp.model;

import java.util.Objects;

public class customer {
    private String id;
    private String name;
    private String email;
    private String password;

    public Customer() {
    }

    // Getter for customerId
    public String getId() {
        return id;
    }

    // Setter for customerId
    public Customer setId(String id) {
        this.id = id;
        return this;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public int hashCode() {
        return Objects.hash(id, name, email, password);
    }

    // Overriding equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(password, customer.password);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Customer{" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
