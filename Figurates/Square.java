package problem61.Figurates;

import problem61.Figurate;

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
