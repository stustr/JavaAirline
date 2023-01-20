package JavaAirPkg;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double weightPerPassenger() {
        return ((double) flight.getPlane().getTotalWeight() / 2) / flight.getPlane().getCapacity();
    }

    public int weightBooked() {
        return flight.getPassengers().size() * 1000;
    }

    public int weightAvailable() {
        return (flight.getPlane().getTotalWeight() / 2) - this.weightBooked();
    }
}
