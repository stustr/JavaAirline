package JavaAirPkg;

public class Passenger {
    private final String name;
    private final int bags;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
    }

    public int getBags() {
        return bags;
    }

    public String getName() {
        return this.name;
    }
}
