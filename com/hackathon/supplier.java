package com.hackathon;

import java.util.*;

public class supplier {
    private worker w;                    // need this for the verification
    protected HashMap<String, worker> workerList;
    private String supplierName;
    private String supplierLocation;


    public supplier (String name, String location) {
        this.supplierName = name;
        this.supplierLocation = location;
        workerList = new HashMap<>();
    }

    public int getID() { return supplierID; }

    public String getName() { return supplierName; }

    public String getLocation() { return supplierLocation; }


    public void addWorker(String name, int age, float wages, String bankAccount) {
        worker w = new worker(name, age, wage, bankAccount);
        workerList.put(bankAccount, w);
    }

    public void removeWorker(String bankAccount) {
        if(workerList.containsKey(bankAccount)) workerList.remove(bankAccount);
        else System.out.println("Bank account does not exist");
    }

    public boolean supplierVerified() {
        if(w.overallVerity()) return true;
        return false;
    }

}
