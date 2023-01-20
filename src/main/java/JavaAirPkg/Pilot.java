package JavaAirPkg;

public class Pilot extends AirlineStaff {
    String licenceNumber;

    public Pilot(String name, String licenceNumber) {
        super(name, "Pilot");
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane() {
        return "flying";
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}


