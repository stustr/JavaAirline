import JavaAirPkg.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Foo", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Foo", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void passengerHasFlightAttribute() {
        assertNull(passenger.getFlight());
    }

}
