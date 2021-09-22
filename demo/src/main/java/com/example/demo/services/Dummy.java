package com.example.demo.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class Dummy {
    public final HashMap<Integer,String> countryIdMap = new HashMap<>();

    public HashMap<Integer, String> getCountryIdMap() {
        return countryIdMap;
    }

    public Dummy() {

        countryIdMap.put(1,"India");
        countryIdMap.put(2,"UK");
        countryIdMap.put(3,"Japan");

    }
}
