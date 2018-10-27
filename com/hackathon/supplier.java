package com.hackathon;

import java.util.*;

public class supplier {

    private HashMap<String, worker> workerList;
    private String supplierName;
    private String supplierLocation;


    public supplier (String name, String location) {
        this.supplierName = name;
        this.supplierLocation = location;
        workerList = new HashMap<>();
    }


    public String getName() { return supplierName; }

    public String getLocation() { return supplierLocation; }


    public void addWorker(String name, int age, float wage, String bankAccount) {
        worker w = new worker(name, age, wage, bankAccount);
        workerList.put(bankAccount, w);
    }

    public void removeWorker(String bankAccount) {
        if(workerList.containsKey(bankAccount)) workerList.remove(bankAccount);
        else System.out.println("Bank account does not exist");
    }




    // Verifications

    // boolean verification

    public boolean verifyWorkers(){
        for (worker w : workerList.values()) {
            if (!w.overallVerity()) return false;
        }
        return true;
    }

    // Percentage verification

    public double verityScore(){
        double goodWorkers = 0.0;
        for (worker w : workerList.values()) {
            if (w.overallVerity()) goodWorkers++;
        }
        return goodWorkers/workerList.size();
    }

    // individual verifications

    public double ageVerity() {
        double goodWorkers = 0.0;
        for (worker w : workerList.values()) {
            if (w.ageVerity()) goodWorkers++;
        }
        return goodWorkers/workerList.size();
    }

    public double payVerity() {
        double goodWorkers = 0.0;
        for (worker w : workerList.values()) {
            if (w.payVerity()) goodWorkers++;
        }
        return goodWorkers/workerList.size();
    }

    public double timeVerity() {
        double goodWorkers = 0.0;
        for (worker w : workerList.values()) {
            if (w.timeVerity()) goodWorkers++;
        }
        return goodWorkers/workerList.size();
    }



}
