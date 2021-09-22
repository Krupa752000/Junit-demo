package com.example.demo.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Component
public class CountryService {
    private final Dummy dummy;

    public CountryService(Dummy dummy) {
        this.dummy = dummy;
    }

    public Collection getAllCountries(){
        Collection countries =  dummy.getCountryIdMap().values();
        return countries;
        }

    public String getCountryById(int id){
        String country = dummy.getCountryIdMap().get(id);
        return country;
    }

    public void addCountry(){
        int x = dummy.getCountryIdMap().size() + 1;
        dummy.getCountryIdMap().put(x,"Switzerland");

    }

    public void deleteCountry(int id){
        dummy.getCountryIdMap().remove(id);

    }



}
