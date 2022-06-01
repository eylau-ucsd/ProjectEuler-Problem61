package problem61;

public class Heptagon extends Figurate {
    @Override
    public int get(int n) {
        return (n * (5 * n - 3)) / 2;
    }

    @Override
    public int sides() {
        return 7;
    }
}
