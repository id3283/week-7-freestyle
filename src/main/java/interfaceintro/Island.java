package interfaceintro;

public class Island implements Valueable,RealEstate{
    int squareFootage;

    public Island(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public double getValue() {
        return this.squareFootage * 250;
    }
}
