package JavaAirPkg;

public enum PlaneType {
    BOEING747(416, 910),
    ;

    private final int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
