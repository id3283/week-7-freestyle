package interfaceintro;

public class House implements Valueable,RealEstate{

    int squareFootage;
    int condition;

    public int getSquareFootage() {
        return squareFootage;
    }

    public House(int squareFootage, int condition) {
        this.squareFootage = squareFootage;
        this.condition = condition;
    }

    @Override
    public double getValue() {
        return this.squareFootage * 150;
    }
}
