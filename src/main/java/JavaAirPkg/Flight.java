package JavaAirPkg;

import java.util.ArrayList;

public class Flight {
    private ArrayList pilots;
    private ArrayList cabinCrew;
    private ArrayList passengers;
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

    public ArrayList getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList passengers) {
        this.passengers = passengers;
    }

    public ArrayList getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList pilots) {
        this.pilots = pilots;
    }

    public PlaneType getPlaneType() {
        return this.plane.getType();
    }

}
