package generics;

public class IntegerPair {
    // A pair contains two integers
    private int leftNumber;
    private int rightNumber;

    public IntegerPair(int leftNumber, int rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public int getLeftNumber() {
        return this.leftNumber;
    }

    public int getRightNumber() {
        return this.rightNumber;
    }

    public void swap() {
        int temp = leftNumber;
        leftNumber = rightNumber;
        rightNumber = temp;
    }

    public void print() {
        System.out.println("Left: " + this.leftNumber + " - " + "Right: " + this.rightNumber);
    }
}