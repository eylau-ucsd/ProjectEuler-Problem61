package problem61;

public class Pentagon extends Figurate {
    @Override
    public int get(int n) {
        return (n * (3 * n - 1)) / 2;
    }

    @Override
    public int sides() {
        return 5;
    }
}
