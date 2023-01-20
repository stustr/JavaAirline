package JavaAirPkg;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilots,
                  ArrayList<CabinCrewMember> cabinCrew,
                  Plane plane, String flightNumber,
                  String destination, String departure,
                  String departureTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrewMember> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public PlaneType getPlaneType() {
        return this.plane.getType();
    }

    public int numberOfAvailableSeats() {
        return this.plane.getCapacity();
    }

    public void bookAPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > this.passengers.size()) {
            this.passengers.add(passenger);
        }
    }

}
