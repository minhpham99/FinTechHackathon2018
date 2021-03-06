package com.hackathon;

import java.util.*;

public class supplier {

    private HashMap<String, worker> workerList;
    private String supplierName;
    private String supplierLocation;
    private ArrayList<bank> banks;


    public supplier (String name, String location) {
        this.supplierName = name;
        this.supplierLocation = location;
        workerList = new HashMap<>();
        banks = new ArrayList<>();
    }
    public void addBank(String name) { banks.add(new bank(name)); }


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

    public boolean hasWorker(String accNumber) {
        return workerList.keySet().contains(accNumber);
    }

    public worker getWorker(String accNumber) {
        return workerList.get(accNumber);
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
