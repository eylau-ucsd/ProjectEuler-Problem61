package problem61.Figurates;

import problem61.Figurate;

public class Nonagon extends Figurate {
    @Override
    public int get(int n) {
        return n * (7 * n - 5) / 2; 
    }

    @Override
    public int sides() {
        return 9;
    }
}
