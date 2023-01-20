import JavaAirPkg.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Foo");
    }

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Foo", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank() {
        assertEquals("Cabin crew member",
                cabinCrewMember.getRank());
    }
}
