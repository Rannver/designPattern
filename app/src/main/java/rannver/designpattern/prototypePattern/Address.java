package rannver.designpattern.prototypePattern;

/**
 * Created by Rannver on 2018/3/15.
 */

public class Address  {

    private String city;
    private String district;
    private String street;

    public Address(String city,String district,String street){
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address: "+city+", "+district+", "+street;
    }
}
