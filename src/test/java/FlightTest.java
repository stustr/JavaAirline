import JavaAirPkg.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        pilot = new Pilot("Foo", "123");
        ArrayList<Pilot> pilotList = new ArrayList<>();
        pilotList.add(pilot);

        cabinCrewMember = new CabinCrewMember("Bar");
        ArrayList<CabinCrewMember> cabinCrewMembers =
                new ArrayList<>();
        cabinCrewMembers.add(cabinCrewMember);

        plane = new Plane(PlaneType.BOEING747);

        passenger = new Passenger("Baz", 1);

        flight = new Flight(pilotList, cabinCrewMembers,
                plane, "1", "EDI", "GLA", new Date(2023,
                Calendar.JANUARY,25));

        flight.bookAPassenger(passenger);
    }

    @Test
    public void flightHasAPilot() {
        assertEquals(1, flight.getPilots().size());
    }

    @Test
    public void flightHasCabinCrew() {
        assertEquals(1, flight.getCabinCrew().size());
    }

    @Test
    public void flightHasPassengerList() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.BOEING747,
                flight.getPlaneType());
    }

    @Test
    public void flightCanGetFreeSeats() {
        assertEquals(416, flight.numberOfAvailableSeats());
    }

    @Test
    public void flightCanBook() {
        assertEquals(1, flight.getPassengers().size());
        assertEquals("1", passenger.getFlight());
        assertTrue(passenger.getSeatNumber() > 0 && passenger.getSeatNumber() < flight.getPlane().getCapacity());
    }


}
