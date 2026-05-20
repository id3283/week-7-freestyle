package generics.orchestra;

public class DuetWithoutGenerics {
    private Musician left;
    private Musician right;

    DuetWithoutGenerics(Musician left, Musician right) {
        this.left = left;
        this.right = right;
    }

    public Musician getLeft() {
        return this.left;
    }

    public Musician getRight() {
        return this.right;
    }

    public void perform() {
// because T Is-A Musician we know that they
// will have the perform method
        left.play();
        right.play();
    }
}
