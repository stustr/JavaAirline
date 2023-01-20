package JavaAirPkg;
public class Plane {
    private final PlaneType type;
    private int capacity;

    public Plane(PlaneType type) {
        this.type = type;
        this.capacity = type.getCapacity();
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getCapacity() {
        return capacity;
    }
}
