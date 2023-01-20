import JavaAirPkg.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
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
                Calendar.JANUARY, 25));
        flightManager = new FlightManager(flight);
    }

    @Test
    public void flightManagerCanGetPassengerWeightAllowance() {
        assertEquals(1093.75,
                flightManager.weightPerPassenger(), 0.00);
    }

    @Test
    public void flightManagerCanTotalWeightBooked() {
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        assertEquals(2000, flightManager.weightBooked());
    }

    @Test
    public void flightManagerCanTotalWeightAvailable() {
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        assertEquals(453000,
                flightManager.weightAvailable());
    }



}
