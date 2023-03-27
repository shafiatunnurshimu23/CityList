package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
   // public List<City> getCities() {
      //  List<City> cityList = cities;
       // Collections.sort(cityList);
       // return cityList;
   // }


    /**
     * assignment
     */


    /**
     *Delete city (if not exists throw error
     * @param city
     */
    public void Delete(City city){
        if(!cities.contains(city)){
          throw new IllegalArgumentException();
        }
        else {
           cities.remove(city);
        }

    }


    /**
     *returns total number of cities
     * @return
     */
    public int Count(){
        return cities.size();

    }

    /**
     *     modified getCities() method
     *
     *     if flag=1 sort by city name
     *     else if flag=2 sort by province name
     *
     * @param flag
     * @return
     */

    public List<City> Sort(int flag){
        List<City> cityList = cities;
        if(flag==1) {
            Collections.sort(cityList, new citySortByName());
        }
        else if(flag==2) {
            Collections.sort(cityList, new citySortByProvince());
        }
        return cityList;

    }
}
