import JavaAirPkg.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Plane plane;

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

        flight = new Flight(pilotList, cabinCrewMembers,
                plane, "1", "EDI", "GLA", "12:20");
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


}