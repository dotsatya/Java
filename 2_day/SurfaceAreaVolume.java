class Room {
    private double length, width, height;

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class SurfaceAreaVolume {
    public static void main(String[] args) {
        Room room = new Room(10, 15, 20);
        System.out.println("Surface Area: " + room.calculateSurfaceArea());
        System.out.println("Volume: " + room.calculateVolume());
    }
}
