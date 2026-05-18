package interfaceintro;

public class Sailboat implements Valueable {
    int lengthInFeet;

    public Sailboat(int lengthInFeet) {
        this.lengthInFeet = lengthInFeet;
    }

    @Override
    public double getValue() {
        return 5000 * this.lengthInFeet;
    }
}
