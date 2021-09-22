package com.example.demo.controllers;

import com.example.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
public class Controllers {
    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public Collection getCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/countries/{id}")
    public String getCountryById(@PathVariable(value = "id") int id){
        return countryService.getCountryById(id);
    }

    @PostMapping("/addcountry")
    public void addCountry(){
        countryService.addCountry();
    }


    @DeleteMapping("/deletecountry/{id}")
    public void deleteCountry(@PathVariable(value = "id") int id){
        countryService.deleteCountry(id);
    }


}
