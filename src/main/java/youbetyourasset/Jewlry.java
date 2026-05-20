package youbetyourasset;

public class Jewlry extends FixedAsset{
    private double karats;

    public Jewlry(String name, double value) {
        super(name, value);
    }


    public void wear() {
        System.out.println("Ooooh!  I look good in diamonds!");
    }


}
