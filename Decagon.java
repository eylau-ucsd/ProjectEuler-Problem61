package problem61;

public class Decagon extends Figurate {
    @Override
    public int get(int n) {
        return 4 * n * n - 3 * n;
    }

    @Override
    public int sides() {
        return 10;
    }
}
