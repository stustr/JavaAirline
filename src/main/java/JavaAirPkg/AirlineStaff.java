package JavaAirPkg;

public abstract class AirlineStaff {
    private final String name;
    private final String rank;

    public AirlineStaff(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }
}
