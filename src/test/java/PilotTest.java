import JavaAirPkg.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Foo", "123");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Foo", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals("Pilot", pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber() {
        assertEquals("123", pilot.getLicenceNumber());
    }


    @Test
    public void pilotCanFlyPlane() {
        assertEquals("flying", pilot.flyPlane());
    }

}
