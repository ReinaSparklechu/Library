package com.beans;

import com.model.Customer;
import com.model.Transaction;

import java.math.BigDecimal;

public class TransactionFactory {

    public Transaction createTransaction(Customer to, Customer from, BigDecimal amount){
        return new Transaction(to,from,amount);
    }
}
