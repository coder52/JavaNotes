package B05_VisitorPattern.Task1;

interface Vehicle {
    //every vehicle goes under full service and the vehicle inspector calculates the total service charge
    int accept(VehicleInspector vehicleInspector);
}

//vehicle inspector visits all the vehicle
interface VehicleInspector {
    //visits car
    int visit(Car car);
    //visits van
    int visit(Van van);
    //visits motor bike
    int visit(Motorbike motorbike);
}

//the class implements the Vehicle interface
class Car implements Vehicle{
    private String color;
    private int manufactureDate;
    //creating a constructor of the class
    public Car(String color, int manufactureDate) {
        this.color = color;
        this.manufactureDate = manufactureDate;
    }
    //creating getters and setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    //overrides the accept() method of the Vehicle interface
    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}

//the class implements the Vehicle interface
class Motorbike implements Vehicle{
    private int engineCapacity;
    private String brand;
    //creating constructor of the class
    public Motorbike(int engineCapacity, String brand) {
        this.engineCapacity = engineCapacity;
        this.brand = brand;
    }
    //generating getters and setters
    public int getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    //overrides the accept() method of the Vehicle interface
    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}

//the class implements the Vehicle interface
class Van implements Vehicle{
    private int storageCapacity;
    private int numberOfDoors;
    //creating a constructor of the class
    public Van(int storageCapacity, int numberOfDoors) {
        this.storageCapacity = storageCapacity;
        this.numberOfDoors = numberOfDoors;
    }
    //generating getters and setters
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    //overrides the accept() method of the Vehicle interface
    @Override
    public int accept(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }
}

//the class implements the VehicleInspector interface
class VehicleInspection implements VehicleInspector{
    //the method returns the total service charge for car visited by the vehicle inspector
    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        if(car.getColor()=="Black"){
            serviceCharge += 100;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Car: " + serviceCharge);
        return serviceCharge;
    }
    //overrides the visit() method of the VehicleInspector interface when the inspector visit the vehicle
//the method returns the total service charge for van visited by the vehicle inspector
    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if(van.getNumberOfDoors()>4){
            serviceCharge += 500;
        }else{
            serviceCharge += 100;
        }
        System.out.println("Service Charge for Van: " + serviceCharge);
        return serviceCharge;
    }
    //the method returns the total service charge for motorbike visited by the vehicle inspector
    @Override
    public int visit(Motorbike motorbike) {
        int serviceCharge = 0;
        if(motorbike.getEngineCapacity()>=200){
            serviceCharge += 200;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Motorbike: " + serviceCharge);
        return serviceCharge;
    }
}

public class VehicleService {
    //returns the total service charge of all the vehicles that are gone under full service
    private static int calculateTotal(Vehicle[] vehicles) {
        VehicleInspector inspector = new VehicleInspection();
        int total = 0;
        for(Vehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
    //driver code
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Black", 2010),
                new Van(5000, 6),
                new Motorbike(100, "TVS")
        };
        int totalCost = calculateTotal(vehicles);
        System.out.println("Total Service Charge: " + totalCost);
    }
}

