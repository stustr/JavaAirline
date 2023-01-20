package JavaAirPkg;

public class Passenger {
    private final String name;
    private final int bags;
    private String flight;
    private int seatNumber;

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

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
