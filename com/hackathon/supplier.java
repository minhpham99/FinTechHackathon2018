package com.hackathon;

import javax.naming.Name;
import java.util.*;

public class supplier {

    protected worker w;
    protected HashMap<String, String> workerList = new HashMap<>();
    protected int supplierID;
    protected String supplierName;
    protected String supplierLocation;


    public void addWorker(String name, int age, float wages, String bankAccount, HashMap workerList) {
        name = w.getName();
        age = w.getAge();
        wages = w.getExpectedPay();
        bankAccount = w.getBankAccount();
        worker newWorker = new worker(name, age, wages, bankAccount);
        this.workerList.put(bankAccount, name);
    }


}
