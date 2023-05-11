package com.beans;

import com.model.Transaction;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TransactionProcessor {
    private static ExecutorService threadPool   =Executors.newFixedThreadPool(4);
    public void processTransaction(Transaction t){

        Runnable process = () ->{
            if(t.getCustomerFrom().getBalance().compareTo(t.getTransactionAmount()) >=0){
                t.getCustomerTo().setBalance(t.getCustomerTo().getBalance().add(t.getTransactionAmount()));
                t.getCustomerFrom().setBalance(t.getCustomerFrom().getBalance().subtract(t.getTransactionAmount()));
            }
        };
        threadPool.submit(process);
    }
}
