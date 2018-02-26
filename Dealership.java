package Java.dealership.model;

public class Dealership implements IDealership {
    private String dealershipID;
    private Manufacturer manufacturer;
    private Car car;
    private boolean used;
    private double price;

    //Constructor
    public Dealership(){
        this.dealershipID = null;
        this.manufacturer = null;
        this.car = null;
        this.used = false;
        this.price = 0;
    }
    public Dealership(String dealershipID, Manufacturer manufacturer, Car car, boolean used,
                      int stockNumber, double price){
        this.dealershipID = dealershipID;
        this.manufacturer = manufacturer;
        this.car = car;
        this.used = used;
        this.price = price;
    }

    public String getDealershipID() {
        return dealershipID;
    }

    public void setDealershipID(String dealershipID) {
        this.dealershipID = dealershipID;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
