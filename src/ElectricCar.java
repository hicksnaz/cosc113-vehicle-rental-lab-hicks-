public class ElectricCar extends Car {
    private int batteryLevel;
 
    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);
        if (batteryLevel < 0 || batteryLevel > 100) {
            System.out.println("Invalid battery level rejected. Defaulting to 100.");
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
 
    public int getBatteryLevel() { return batteryLevel; }
 
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            System.out.println("Invalid battery level rejected.");
            return;
        }
        this.batteryLevel = batteryLevel;
    }
 
    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);
        if (batteryLevel > 0) {
            batteryLevel -= 1;
        }
    }
 
    @Override
    public void describe() {
        super.describe();
        System.out.println("Battery: " + batteryLevel + "%");
    }
}
