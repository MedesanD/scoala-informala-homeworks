package Java.dealership.model;

public class GreenBonusProgramHistory implements IGreenBonusProgramHistory {
    private String clientFirstName;
    private String clientLastName;
    private String dealershipID;
    private Car car;
    private double price;

    //Constructor
    public GreenBonusProgramHistory(){
        this.clientFirstName = null;
        this.clientLastName = null;
        this.dealershipID = null;
        this.car = null;
        this.price = 0;
    }
    public GreenBonusProgramHistory (String clientFirstName, String clientLastName, String dealershipID, Car car, double price){
        this.clientFirstName = clientFirstName;
        this.clientLastName  = clientLastName;
        this.dealershipID = dealershipID;
        this.car = car;
        this.price = price;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getDealershipID() {
        return dealershipID;
    }

    public void setDealershipID(String dealershipID) {
        this.dealershipID = dealershipID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
