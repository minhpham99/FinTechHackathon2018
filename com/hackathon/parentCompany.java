package com.hackathon;

import java.util.HashMap;

public class parentCompany {
    private String companyName;
    private HashMap<String, supplier> supplierList;
    private supplier s;

    public parentCompany(String name) {
        this.companyName = name;
        supplierList = new HashMap<>();
    }
    public String getName() { return companyName; }

    public void addSupplier(String name, String location) {
        supplier s = new supplier(name, location);
        if (supplierList.containsKey(name)) throw new RunTimeException("Supplier already in the list");
        supplierList.put(name, s);
    }

    public void removeSupplier(String name) {
        if(supplierList.containsKey(name)) supplierList.remove(name);
        else throw new RunTimeException("Supplier does not exist in the list");
    }
}
