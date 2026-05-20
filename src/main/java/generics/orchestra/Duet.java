package generics.orchestra;

class Duet<T extends Musician> {
    private T left;
    private T right;

    Duet(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return this.left;
    }

    public T getRight() {
        return this.right;
    }

    public void perform() {
// because T Is-A Musician we know that they
// will have the perform method
        left.play();
        right.play();
    }
}
