package JavaAirPkg;

public abstract class AirlineStaff {
    String name;
    String rank;

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
