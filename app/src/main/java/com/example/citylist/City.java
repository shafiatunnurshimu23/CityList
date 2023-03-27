package com.example.citylist;

import java.util.Comparator;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}

/**
 * sorting according to city name
 */
class citySortByName implements Comparator<City>{

    @Override
    public int compare(City c1, City c2) {
        return c1.getCityName().compareTo(c2.getCityName());
    }
}

/**
 * sorting according to Province name
 */

class citySortByProvince implements Comparator<City>{

    @Override
    public int compare(City c1, City c2) {
        return c1.getProvinceName().compareTo(c2.getProvinceName());
    }
}