package com.hackathon;

import java.util.*;

public class supplier {

    protected worker w;
    protected HashMap<String, worker> workerList = new HashMap<>();
    protected int supplierID;
    protected String supplierName;
    protected String supplierLocation;

    public int getID() { return supplierID; }

    public String getName() { return supplierName; }

    public String getLocation() { return supplierLocation; }

    public void addWorker(String name, int age, float wages, String bankAccount, HashMap workerList) {
        name = w.getName();
        age = w.getAge();
        wages = w.getExpectedPay();
        bankAccount = w.getBankAccount();
        worker newWorker = new worker(name, age, wages, bankAccount);
        this.workerList.put(bankAccount, newWorker);
    }

    public void removeWorker(String bankAccount) {
        if(workerList.containsKey(bankAccount) == true) workerList.remove(bankAccount);
        else System.out.print("Account number does not exist\n");
    }

    public boolean supplierVerified(boolean ageVerified, boolean payVerified, boolean paidOnTime) {

        return false;
    }

}
