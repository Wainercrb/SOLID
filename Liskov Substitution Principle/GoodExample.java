abstract class Vehicle {
    public void getAge(){
        System.out.println("Age: ");
    }

    public void getNoPreviousOwners(){
        System.out.println("Previous Owners:");
    }
}


abstract class FuelableVehicle extends Vehicle {
    public void get100MileFuelRequirements()
    {
        System.out.println("Required Fuel:");
    }
}

class Car extends FuelableVehicle {
    @Override
    public void getAge() {
        super.getAge();
        //go into the database and retrieve the age of the concrete car
        System.out.println("2 years");
    }

    @Override
    public void getNoPreviousOwners() {
        super.getNoPreviousOwners();
        //go into the database and retrieve the number of previous owners
        System.out.println("1 prev. owner");
    }

    @Override
    public void get100MileFuelRequirements() {
        super.get100MileFuelRequirements();
        //go into the database and retrieve the 100 mile fuel requirement
        System.out.println("4 gallons");
    }
}

class Bicycle extends Vehicle {

    @Override
    public void getAge() {
        super.getAge();
    }
    @Override
    public void getNoPreviousOwners() {
        super.getNoPreviousOwners();
    }
}


public class Main {
    public static void main(String[] args) {
        FuelableVehicle car = new Car();
        car.getAge();
        car.getNoPreviousOwners();
        car.get100MileFuelRequirements();


        Vehicle bike = new Bicycle();
        bike.get100MileFuelRequirements(); // Error
    }
}