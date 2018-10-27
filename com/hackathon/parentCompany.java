package com.hackathon;

import java.util.HashMap;

public class parentCompany {
    private String companyName;
    private HashMap<String, supplier> supplierList = new HashMap<>();
    private supplier s;

    public parentCompany(String name) { this.companyName = name; }
    public String getName() { return companyName; }
}
