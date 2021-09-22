package com.example.demo;

import com.example.demo.services.CountryService;
import com.example.demo.services.Dummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CountryServiceTests {

@Mock
Dummy dummy;



@InjectMocks
    CountryService countryService;



    @Test
    public void test_getAllCountries(){


        when(dummy.getCountryIdMap()).thenReturn((HashMap<Integer, String>) expectedCountryMap());
        assertEquals(expectedCountryMap().size(),
                countryService.getAllCountries().size());


    }

    private Map<Integer, String> expectedCountryMap(){
        Map<Integer, String > countriesMap = new HashMap<Integer, String>();
        countriesMap.put(1,"India");
        countriesMap.put(2,"UK");


        return countriesMap;
    }
}

