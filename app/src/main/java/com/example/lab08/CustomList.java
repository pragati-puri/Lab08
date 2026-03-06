package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    // demo comment
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }


    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    //delete city from the list
    public void deleteCity(City city){cities.remove(city);}

    //count the number of cities in the list
    public int countCities(){
        return cities.size();
    }

}
