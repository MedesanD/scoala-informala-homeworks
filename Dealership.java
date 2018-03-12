package Java.dealership.model;

import java.util.List;

public class Dealership implements IDealership {
    private String dealershipID;
    private List<String> manufacturerID;
    private List<Car> car;

    //Constructor
    public Dealership(){
        this.dealershipID = null;
        this.manufacturerID = null;
        this.car = null;
    }
    public Dealership(String dealershipID, List<String> manufacturerID, List<Car> car, int stockNumber, double price){
        this.dealershipID = dealershipID;
        this.manufacturerID = manufacturerID;
        this.car = car;
    }

    public String getDealershipID() {
        return dealershipID;
    }

    public void setDealershipID(String dealershipID) {
        this.dealershipID = dealershipID;
    }

    public List<String> getManufacturer() {
        return manufacturerID;
    }

    public void setManufacturer(List<String> manufacturer) {
        this.manufacturerID = manufacturer;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

}
