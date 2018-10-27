package com.hackathon;

import java.util.*;
import java.lang.*;

public class bank {
    private ArrayList<String> clients;
    private supplier workSource;
    private String name;

    public bank (String name) { this.name = name; }

    public String getName() { return name; }

    public boolean clientCheck(String accNumber) {
        return (workSource.hasWorker(accNumber) && clients.contains(accNumber));
    }

    public worker fetchWorker(String accNumber) {
        if (!clientCheck(accNumber) ) throw new RuntimeException("Worker does not exist");
        return workSource.getWorker(accNumber);
    }

    public void addClient(String bankAccount) {
        if (clients.contains(bankAccount)) throw new RuntimeException("Client already in the list");
        clients.add(bankAccount);
    }

    public void removeClient(String bankAccount) {
        for(String s: clients) {
            if(clients.contains(bankAccount)) clients.remove(bankAccount);
            else throw new RuntimeException("Client does not exist in the list");
        }
    }



    public void validateWorker(worker w) {
        if (true) w.verifyAge();
        if (true) w.verifyPay();
        if (true) w.verifyPaidOnTime();

    }

}
