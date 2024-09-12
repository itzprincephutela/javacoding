class Cuboid {
    private int length, breadth, height;

    // Setters
    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public void setHeight(int h) {
        height = h;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    // Calculate volume
    public int getVolume() {
        return length * breadth * height;
    }

    // Calculate surface area
    public int getSurfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

public class Qus3 {
    public static void main(String[] args) {
        Cuboid C = new Cuboid();
        C.setLength(5);
        C.setBreadth(10);
        C.setHeight(15);

        // Print dimensions
        System.out.println("Length: " + C.getLength());
        System.out.println("Breadth: " + C.getBreadth());
        System.out.println("Height: " + C.getHeight());

        // Print volume and surface area
        System.out.println("Volume: " + C.getVolume());
        System.out.println("Surface Area: " + C.getSurfaceArea());
    }
}
