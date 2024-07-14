import java.util.Scanner;

class Vehicle {
    private String registrationNumber;
    private String color;
    private String type;

    public Vehicle(String registrationNumber, String color, String type) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.type = type;
    }

    public void printDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}

class Car extends Vehicle {
    private String make;
    private int cc;
    private String fuelType;

    public Car(String registrationNumber, String color, String make, int cc, String fuelType) {
        super(registrationNumber, color, "Car");
        this.make = make;
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Make: " + make);
        System.out.println("CC: " + cc);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    private String make;
    private int cc;
    private String fuelType;

    public Truck(String registrationNumber, String color, String make, int cc, String fuelType) {
        super(registrationNumber, color, "Truck");
        this.make = make;
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Make: " + make);
        System.out.println("CC: " + cc);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Motorcycle extends Vehicle {
    private String make;
    private int cc;
    private String fuelType;

    public Motorcycle(String registrationNumber, String color, String make, int cc, String fuelType) {
        super(registrationNumber, color, "Motorcycle");
        this.make = make;
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Make: " + make);
        System.out.println("CC: " + cc);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class VehicleDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car registration number: ");
        String carRegNum = scanner.nextLine();
        System.out.print("Enter car color: ");
        String carColor = scanner.nextLine();
        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car CC: ");
        int carCC = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter car fuel type: ");
        String carFuelType = scanner.nextLine();

        Car car = new Car(carRegNum, carColor, carMake, carCC, carFuelType);

        System.out.print("Enter truck registration number: ");
        String truckRegNum = scanner.nextLine();
        System.out.print("Enter truck color: ");
        String truckColor = scanner.nextLine();
        System.out.print("Enter truck make: ");
        String truckMake = scanner.nextLine();
        System.out.print("Enter truck CC: ");
        int truckCC = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter truck fuel type: ");
        String truckFuelType = scanner.nextLine();

        Truck truck = new Truck(truckRegNum, truckColor, truckMake, truckCC, truckFuelType);
        		
        System.out.print("Enter motorcycle registration number: ");
        String motorcycleRegNum = scanner.nextLine();
        System.out.print("Enter motorcycle color: ");
        String motorcycleColor = scanner.nextLine();
        System.out.print("Enter motorcycle make: ");
        String motorcycleMake = scanner.nextLine();
        System.out.print("Enter motorcycle CC: ");
        int motorcycleCC = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter motorcycle fuel type: ");
        String motorcycleFuelType = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(motorcycleRegNum, motorcycleColor, motorcycleMake, motorcycleCC, motorcycleFuelType);

        System.out.println("\nCar details:");
        car.printDetails();

        System.out.println("\nTruck details:");
        truck.printDetails();

        System.out.println("\nMotorcycle details:");
        motorcycle.printDetails();

        scanner.close();
    }
}
