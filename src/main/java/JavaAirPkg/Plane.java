package JavaAirPkg;
public class Plane {
    private final PlaneType type;
    private int capacity;
    private int totalWeight;

    public Plane(PlaneType type) {
        this.type = type;
        this.capacity = type.getCapacity();
        this.totalWeight = type.getTotalWeight();
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
