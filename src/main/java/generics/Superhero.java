package generics;

public class Superhero {
    private String name;
    private String superPower;

    public Superhero(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        // Professor Pardox (Hardass Grading)
        // SuperheroName (superpower)
        return this.name + "(" + this.superPower + ")";
    }

}
