public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        ElectricCar tesla = new ElectricCar("Tesla", 2024, 4, 90);
 
        System.out.println("--- Car ---");
        car.describe();
        car.accelerate(30);
        System.out.println("Speed: " + car.getSpeed());
        car.showTypes();
 
        System.out.println("\n--- ElectricCar ---");
        tesla.describe();
        tesla.accelerate(40);
        System.out.println("Speed: " + tesla.getSpeed());
        tesla.describe(); 
        tesla.showTypes();
 
        System.out.println("\n--- Validation ---");
        car.setSpeed(-10); 
        car.setDoors(3);    
    
    }
}
