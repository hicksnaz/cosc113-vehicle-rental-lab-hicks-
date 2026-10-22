public class Car extends Vehicle {
    private int doors;
 
    String type = "Car";
 
    public Car(String brand, int year, int doors) {
        super(brand, year); 
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Invalid doors rejected. Defaulting to 4.");
            this.doors = 4;
        }
    }
 
    public int getDoors() { return doors; }
 
    public void setDoors(int doors) {
        if (doors != 2 && doors != 4) {
            System.out.println("Invalid doors rejected.");
            return;
        }
        this.doors = doors;
    }
 
    @Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + doors);
    }
 
    public void showTypes() {
        System.out.println("Type: " + this.type + " | Parent type: " + super.type);
    }
}
