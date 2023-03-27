package com.example.citylist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity()
    {
        return new City("Edmonton", "AB");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.Sort(1).size());

        City city = new City("Regina", "SK");
        cityList.add(city);

        assertEquals(2, cityList.Sort(1).size());
        assertTrue(cityList.Sort(1).contains(city));
    }

    @Test
    public void testAddException() {
        CityList cityList = new CityList();
        City city = mockCity();
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }




    /**
     *   assignment
     */
    /**
     *    Delete() testing
     */
    @Test
    public void testDelete(){
        CityList cityList = new CityList();
        City c1 = new City("Bogura", "Jalashwaritala");
        cityList.add(c1);
        City c2 = new City("Dhaka", "Muhammadpur");
        cityList.add(c2);
        City c3 = new City("Asam", "abcde");
        cityList.add(c3);

        cityList.Delete(c2);
        assertTrue(!cityList.Sort(1).contains(c2)); //c2 is deleted. So, it will not appear in the cityList
        assertTrue(cityList.Sort(1).contains(c3));    //cityList contains c3='Asam' and c1='Bogura' so c3 appears first

    }

    /**
     *    if want to delete a city,not part of cityList,there will be an exception
     */
    @Test
    public void testDeleteException(){
        CityList cityList = new CityList();
        City c1 = new City("Bogura", "Jalashwaritala");
        cityList.add(c1);
        City c2 = new City("Dhaka", "Muhammadpur");
        cityList.add(c2);
        City c3 = new City("Asam", "abcde");

        cityList.Delete(c1);
        assertTrue(!cityList.Sort(1).contains(c1)); //c1 is added to list so can be deleted

        cityList.Delete(c3);     //c3 is not in the cityList. So, it will throw an exception
    }


    /**
     *  test Count() function working perfectly or not
     */
    @Test
    public void testCount() {
        CityList cityList = new CityList();
        City c1 = new City("Bogura", "Jalashwaritala");
        cityList.add(c1);
        City c2 = new City("Dhaka", "Muhammadpur");
        cityList.add(c2);
        City c3 = new City("Asam", "abcde");
        cityList.add(c3);

        assertEquals(3, cityList.Count());
    }

    /**
     * test Sort() function working perfectly or not
     */
    @Test
    public void testSort() {
        CityList cityList = new CityList();
        City c1 = new City("Bogura", "Jalashwaritala");
        cityList.add(c1);
        City c2 = new City("Dhaka", "Muhammadpur");
        cityList.add(c2);
        City c3 = new City("Asam", "Xyxzjk");
        cityList.add(c3);

        assertEquals(0, c3.compareTo(cityList.Sort(1).get(0)));// Sort according to the City Name

         assertEquals(0, c1.compareTo(cityList.Sort(2).get(0)));   // Sort according to the Province Name

    }
}
