abstract class Vehicle {
    public void getAge(){
        System.out.println("Age: ");
    }

    public void getNoPreviousOwners(){
        System.out.println("Previous Owners:");
    }

    public void get100MileFuelRequirements()
    {
        System.out.println("Required Fuel:");
    }
}


 class Car extends Vehicle {
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
        Vehicle car = new Car();
        car.getAge();
        car.getNoPreviousOwners();
        car.get100MileFuelRequirements();


        Vehicle bike = new Bicycle();
        bike.get100MileFuelRequirements();
        /*
        * The code compiles and runs without any problems, but leaves us with a meaningless fragment of text. In this case, the customer will just receive a confusing message, but the results could be worse.
        * The problem here is that we have chosen the wrong abstraction when implementing the vehicle class.To conform to the Liskov substitution principle, we have to make sure that all subclasses actually require implementations of the methods we put into the vehicle class. That’s not the case here. There are vehicles such as bicycles that do not require fuel and therefore the get100MileFuelRequirements() method should not be in the vehicle class.
        * Instead, we probably require an intermediate abstraction such as “Fuellable Vehicles” that specifically only covers vehicles requiring fuel.
        * */
    }
}