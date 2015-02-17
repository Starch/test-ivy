package example;

public class Mult {
    private final int multiplier;

    public Mult(int multiplier) {
        this.multiplier = multiplier;
    }

    public int mult(int i) {
        return i * multiplier;
    }
}

