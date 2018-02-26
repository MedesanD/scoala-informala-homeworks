package Java.dealership.model;

public class Manufacturer implements IManufacturer {
    private String name;
    private String address;

    //Constructor
    public Manufacturer(){
        this.name = null;
        this.address = null;
    }
    public Manufacturer(String name, String address){
        this.name = name;
        this.address = address;
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
}
