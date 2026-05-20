package generics;

public class Pair<T> {
    private T leftThing;
    private T rightThing;


//    public IntegerPair(int leftNumber, int rightNumber) {
//        this.leftNumber = leftNumber;
//        this.rightNumber = rightNumber;
//    }
    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

//    public int getLeftNumber() {
//        return this.leftNumber;
//    }

    public T getLeftThing() {
        return this.leftThing;
    }

    public T getRightThing() {
        return this.rightThing;
    }

//    public void swap() {
//        int temp = leftNumber;
//        leftNumber = rightNumber;
//        rightNumber = temp;
//    }

    public void swap() {
        T temp = this.leftThing;
        this.leftThing = this.rightThing;
        this.rightThing = temp;
    }

//    public void print() {
//        System.out.println("Left: " + this.leftNumber + " - " + "Right: " + this.rightNumber);
//    }

    public void print() {
        System.out.println("Left: " + this.leftThing + " - " + "Right: " + this.rightThing.toString());
    }

}
