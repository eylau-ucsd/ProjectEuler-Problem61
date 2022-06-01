package problem61;

public class Square extends Figurate {
    @Override
    public int get(int n) {
        return n * n;
    }

    @Override
    public int sides() {
        return 4;
    }
}
