package youbetyourasset;

public abstract class FixedAsset implements  Valuable{
    private String name;
    private double originalValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.originalValue = value;
    }

    public double getValue() {
        return this.originalValue;
    }
}
