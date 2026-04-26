
class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String b, String c) {
        this.brand = b;
        this.color = c;
    }

    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println();
    }
}
public class MainVehicleIT24030 {
    public static void main(String[] args) {
        // Each pair of arguments = brand + color
        for (int i = 0; i + 1 < args.length; i += 2) {
            Vehicle v = new Vehicle(args[i], args[i + 1]);
            v.start();
        }
    }
}