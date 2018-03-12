package Java.dealership.model;

public class Manufacturer implements IManufacturer {
    private String name;
    private String address;
    private String manufacturerID;

    //Constructor
    public Manufacturer(){
        this.name = null;
        this.address = null;
        this.manufacturerID = null;
    }
    public Manufacturer(String name, String address, String manufacturerID){
        this.name = name;
        this.address = address;
        this.manufacturerID = manufacturerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(String manufacturerID) {
        this.manufacturerID = manufacturerID;
    }
}
