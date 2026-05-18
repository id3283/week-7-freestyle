package youbetyourasset;

public class House extends FixedAsset{
    private int yearBuilt;
    private int sqFeet;
    private int bedrooms;

    public House(String name, double value, int yearBuilt, int sqFeet, int bedrooms) {
        super(name, value);

        this.yearBuilt = yearBuilt;
        this.sqFeet = sqFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return this.sqFeet * 150;
    }
}
