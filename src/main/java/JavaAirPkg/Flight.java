package JavaAirPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Date;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private Date departureTime;
    private ArrayList<Integer> randomisedSeats;

    public Flight(ArrayList<Pilot> pilots,
                  ArrayList<CabinCrewMember> cabinCrew,
                  Plane plane, String flightNumber,
                  String destination, String departure,
                  Date departureTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.randomisedSeats = randomiseSeats();
    }

    public ArrayList randomiseSeats() {
        ArrayList temp = new ArrayList();

        for (int i = 1; i < this.plane.getCapacity() + 1; i++) {
            temp.add(i);
        }

        Collections.shuffle(temp);

        return temp;
    }


    public ArrayList<Integer> getRandomisedSeats() {
        return randomisedSeats;
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

    public void setPassengers
            (ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew
            (ArrayList<CabinCrewMember> cabinCrew) {
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
            passenger.setFlight(this.flightNumber);
            passenger.setSeatNumber(randomisedSeats.get(passengers.indexOf(passenger)));
        }
    }

}
