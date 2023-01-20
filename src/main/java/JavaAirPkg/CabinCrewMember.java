package JavaAirPkg;

public class CabinCrewMember extends AirlineStaff{
    public CabinCrewMember(String name) {
        super(name, "Cabin crew member");
    }

    public String relayMessage(String message) {
        return message;
    }
}
