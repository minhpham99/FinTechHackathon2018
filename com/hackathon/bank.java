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

    public boolean clientCheck(String accNumber) {
        return (workSource.hasWorker(accNumber) && clients.contains(accNumber));
    }

    public worker fetchWorker(String accNumber) {
        if (!clientCheck(accNumber) ) throw new RuntimeException("Worker does not exist");
        return workSource.getWorker(accNumber);
    }






    public void validateWorker(worker w) {
        if (true) w.verifyAge();
        if (true) w.verifyPay();
        if (true) w.verifyPaidOnTime();

    }

}
