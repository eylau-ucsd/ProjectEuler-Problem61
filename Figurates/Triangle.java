package problem61.Figurates;

import problem61.Figurate;

public class Triangle extends Figurate {
    @Override
    public int get(int n) {
        return (n * (n + 1)) / 2;
    }

    @Override
    public int sides() {
        return 3;
    }
}
