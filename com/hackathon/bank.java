package com.hackathon;

import java.util.*;

public class bank {
    private ArrayList<String> clients;
    private supplier workSource;


    /*
    private worker[] workers() {
        worker[] ws = new workers[clients.size()];
        for (int i = 0; i < clients.size(); i ++) {
            ws[i] = workSource.
        }
    }
    */
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
        clients.add(bankAccount);
    }

    public void removeClient(String bankAccount) {
        for(clients c: clients) {
            if(clients.contain(bankAccount)) clients.remove(bankAccount);
            else System.out.println("Client does not exist in the list");
        }
    }




    public void validateWorker(worker w) {
        if (true) w.verifyAge();
        if (true) w.verifyPay();
        if (true) w.verifyPaidOnTime();

    }

}
