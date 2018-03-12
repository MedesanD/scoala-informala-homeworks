package Java.dealership.model;

public class Car implements ICar {

    private String model;
    private String VIN;
    private int year;
    private double  kwMotor;
    private double kwBattery;
    private double consumption;
    private double price;
    private boolean used;
    private boolean inStock;


    //constructor
    public Car (){
        this.model = null;
        this.VIN = null;
        this.year = 0;
        this.kwMotor = 0;
        this.kwBattery = 0;
        this.consumption = 0;
        this.price = 0;
        this.used = false;
        this.inStock = false;

    }
    public Car (String model, String VIN, int year, double kwMotor, double kwBattery, double consumption, double price,
                boolean used, boolean inStock){
        this.model = model;
        this.VIN = VIN;
        this.year = year;
        this.kwMotor = kwMotor;
        this.kwBattery = kwBattery;
        this.consumption = consumption;
        this.price = price;
        this.used = used;
        this.inStock = inStock;

    }

    //Getter and Setter attributes
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getKwMotor() {
        return kwMotor;
    }

    public void setKwMotor(double kwMotor) {
        this.kwMotor = kwMotor;
    }

    public double getKwBattery() {
        return kwBattery;
    }

    public void setKwBattery(double kwBattery) {
        this.kwBattery = kwBattery;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    @Override
    public Car addCar(String model, String VIN, int year, double kwMotor, double kwBattery,
                      double consumption, double price) {
        Car car = new Car();
        car.setModel(model);
        car.setVIN(VIN);
        car.setYear(year);
        car.setKwMotor(kwMotor);
        car.setKwBattery(kwBattery);
        car.setConsumption(consumption);
        car.setPrice(price);
        return car;
    }
}


