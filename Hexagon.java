package problem61;

public class Hexagon extends Figurate {
    @Override
    public int get(int n) {
        return n * (2 * n - 1);
    }

    @Override
    public int sides() {
        return 6;
    }
}
