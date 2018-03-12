package Java.dealership.main;

import Java.dealership.model.Car;
import Java.dealership.model.Dealership;
import Java.dealership.model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer volkswagen = new Manufacturer();
        volkswagen.setManufacturerID("1");
        volkswagen.setAddress("Str. Horea, nr.11");
        volkswagen.setName("Volkswagen");

        Manufacturer audi = new Manufacturer();
        audi.setManufacturerID("2");
        audi.setAddress("Str. Closca, nr 22");
        audi.setName("Audi");

        Manufacturer bmw = new Manufacturer();
        bmw.setManufacturerID("3");
        bmw.setAddress("Str. Crisan, nr 33");
        bmw.setName("BMW");

        Car c1 = new Car();
        c1.setModel("Passat");
        c1.setVIN("123456789");
        c1.setYear(2008);
        c1.setKwMotor(70);
        c1.setKwBattery(100);
        c1.setConsumption(5.2);
        c1.setPrice(8400);
        c1.setUsed(true);
        c1.setInStock(true);

        Car c2 = new Car();
        c2.setModel("Golf");
        c2.setVIN("987654321");
        c2.setYear(2012);
        c2.setKwMotor(85);
        c2.setKwBattery(120);
        c2.setConsumption(4.5);
        c2.setPrice(9200);
        c2.setUsed(true);
        c2.setInStock(false);

        Car c3 = new Car();
        c3.setModel("Touareg");
        c3.setVIN("2345678901");
        c3.setYear(2018);
        c3.setKwMotor(130);
        c3.setKwBattery(200);
        c3.setConsumption(8);
        c3.setPrice(24500);
        c3.setUsed(false);
        c3.setInStock(false);

        Car c4 = new Car();
        c4.setModel("A1");
        c4.setVIN("3456789012");
        c4.setYear(2016);
        c4.setKwMotor(120);
        c4.setKwBattery(120);
        c4.setConsumption(6.4);
        c4.setPrice(12350);
        c4.setUsed(true);
        c4.setInStock(true);

        Car c5 = new Car();
        c5.setModel("A3");
        c5.setVIN("4567890123");
        c5.setYear(2017);
        c5.setKwMotor(89);
        c5.setKwBattery(110);
        c5.setConsumption(7.1);
        c5.setPrice(15000);
        c5.setUsed(true);
        c5.setInStock(true);

        Car c6 = new Car();
        c6.setModel("A6");
        c6.setVIN("5678901234");
        c6.setYear(2018);
        c6.setKwMotor(135);
        c6.setKwBattery(105);
        c6.setConsumption(12.3);
        c6.setPrice(3540);
        c6.setUsed(false);
        c6.setInStock(false);

        Car c7 = new Car();
        c7.setModel("BMW 320i");
        c7.setVIN("5678901234");
        c7.setYear(2013);
        c7.setKwMotor(65);
        c7.setKwBattery(90);
        c7.setConsumption(4.2);
        c7.setPrice(6500);
        c7.setUsed(true);
        c7.setInStock(true);

        Car c8 = new Car();
        c8.setModel("BMW 525d");
        c8.setVIN("6789012345");
        c8.setYear(2016);
        c8.setKwMotor(120);
        c8.setKwBattery(100);
        c8.setConsumption(8.6);
        c8.setPrice(23500);
        c8.setUsed(false);
        c8.setInStock(true);

        Dealership dealer1 = new Dealership();
        dealer1.setDealershipID("Dealer 1");
        List<String> dealer1ManufacturerList = new ArrayList<String>();
        dealer1ManufacturerList.add(volkswagen.getManufacturerID());
        dealer1ManufacturerList.add(audi.getManufacturerID());
        dealer1.setManufacturer(dealer1ManufacturerList);
        List<Car> dealer1ListCar = new ArrayList<Car>();
        dealer1ListCar.add(c1);
        dealer1ListCar.add(c2);
        dealer1ListCar.add(c5);
        dealer1.setCar(dealer1ListCar);

        Dealership dealer2 = new Dealership();
        dealer2.setDealershipID("Dealer 2");
        List<String> dealer2ManufacturerList = new ArrayList<String>();
        dealer2ManufacturerList.add(volkswagen.getManufacturerID());
        dealer2ManufacturerList.add(audi.getManufacturerID());
        dealer2ManufacturerList.add(bmw.getManufacturerID());
        dealer2.setManufacturer(dealer2ManufacturerList);
        List<Car> dealer2ListCar = new ArrayList<Car>();
        dealer2ListCar.add(c3);
        dealer2ListCar.add(c4);
        dealer2ListCar.add(c7);
        dealer2.setCar(dealer2ListCar);

        Dealership dealer3 = new Dealership();
        dealer3.setDealershipID("Dealer 3");
        List<String> dealer3ManufacturerList = new ArrayList<String>();
        dealer3ManufacturerList.add(bmw.getManufacturerID());
        dealer3ManufacturerList.add(audi.getManufacturerID());
        dealer3.setManufacturer(dealer3ManufacturerList);
        List<Car> dealer3ListCar = new ArrayList<Car>();
        dealer3ListCar.add(c6);
        dealer3ListCar.add(c8);
        dealer3.setCar(dealer3ListCar);

        //FEV1 Customer retrieves list of ev cars, number of stock, and their prices from car dealerships.

        //dealer1

        System.out.println("Dealer 1: List of cars: ");
        List<Car> dealer1List = new ArrayList<Car>();
        dealer1List = dealer1.getCar();
        for (Car car: dealer1List){
            System.out.println("Car model:");
            System.out.println(car.getModel());
            System.out.println("Is car in stock:");
            System.out.println(car.isInStock());
            System.out.println("Car price:");
            System.out.println(car.getPrice());

        }
        //dealer 2

        System.out.println("Dealer 2: List of cars: ");
        List<Car> dealer2List = new ArrayList<Car>();
        dealer2List = dealer2.getCar();
        for (Car car: dealer2List){
            System.out.println("Car model:");
            System.out.println(car.getModel());
            System.out.println("Is car in stock:");
            System.out.println(car.isInStock());
            System.out.println("Car price:");
            System.out.println(car.getPrice());

        }

        //dealer 3

        System.out.println("Dealer 3: List of cars: ");
        List<Car> dealer3List = new ArrayList<Car>();
        dealer3List = dealer3.getCar();
        for (Car car: dealer3List){
            System.out.println("Car model:");
            System.out.println(car.getModel());
            System.out.println("Is car in stock:");
            System.out.println(car.isInStock());
            System.out.println("Car price:");
            System.out.println(car.getPrice());

        }

        //FEV2 Customer can filter the list based on the following information: is in stock.

        //filter by is in stock
        List<Car> mainListCar = new ArrayList<Car>();
        mainListCar.addAll(dealer1List);
        mainListCar.addAll(dealer2List);
        mainListCar.addAll(dealer3List);
        System.out.println("Available cars:");
        for (Car car: mainListCar){
            if (car.isInStock() == true){
                System.out.println("Car model:");
                System.out.println(car.getModel());
                System.out.println("Car price:");
                System.out.println(car.getPrice());
            }
        }

    }
}
