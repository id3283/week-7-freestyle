package generics;

public class Pair<T> {
    private T leftThing;
    private T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public T getLeftThing() {
        return this.leftThing;
    }

    public T getRightThing() {
        return this.rightThing;
    }

    public void swap() {
        T temp = this.leftThing;
        this.leftThing = this.rightThing;
        this.rightThing = temp;
    }

    public void print() {
        System.out.println("Left: " + this.leftThing + " - " + "Right: " + this.rightThing.toString());
    }


}
