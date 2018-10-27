package com.hackathon;

import java.util.*;

public class supplier {
                                                    // Removed worker from the class variables because the class doesn't want to be storing one single instance of a worker
    protected HashMap<String, worker> workerList;
//    protected int supplierID;                     // I don't think we need to have suppliers store their own ID, since they don't really care about their own ID
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

    public void removeWorker(String bankAccount) { workerList.remove(bankAccount); }

    public boolean supplierVerified() {
        return false;
    }

}
