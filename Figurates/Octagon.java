package problem61.Figurates;

import problem61.Figurate;

public class Octagon extends Figurate {
    @Override
    public int get(int n) {
        return n * (3 * n - 2);
    }

    @Override
    public int sides() {
        return 8;
    }
}

