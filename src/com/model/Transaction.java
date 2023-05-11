package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class Transaction {

    private final Customer customerTo;
    private final Customer customerFrom;
    private final BigDecimal transactionAmount;

    public Transaction(Customer customerTo, Customer customerFrom, BigDecimal transactionAmount) {
        this.customerTo = customerTo;
        this.customerFrom = customerFrom;
        this.transactionAmount = transactionAmount;
    }

    public Customer getCustomerTo() {
        return customerTo;
    }

    public Customer getCustomerFrom() {
        return customerFrom;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "customerTo=" + customerTo +
                ", customerFrom=" + customerFrom +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
