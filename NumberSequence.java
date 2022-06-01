package problem61;

import java.util.Iterator;

public class NumberSequence implements Iterable<Integer> {
    public static final int DEFAULT_N_LOWER_BOUND = 1000;
    public static final int DEFAULT_N_UPPER_BOUND = 10000;

    private final int nLowerBoundInclusive;
    private final int nUpperBoundExclusive;

    private int xLowerBoundInclusive; // smallest value of x that satisfies g(x) >= n
    private int xUpperBoundExclusive; // largest value of x that satisfies g(x) < n
    private final Figurate incFun;

    public NumberSequence(int prefixedBy, Figurate incFun) {
        this.incFun = incFun;
        nLowerBoundInclusive = prefixedBy * 100;
        nUpperBoundExclusive = nLowerBoundInclusive + 100;
        setXBounds();
    }

    public NumberSequence(Figurate incFun) {
        this.incFun = incFun;
        nLowerBoundInclusive = DEFAULT_N_LOWER_BOUND;
        nUpperBoundExclusive = DEFAULT_N_UPPER_BOUND;
        setXBounds();
    }

    private void setXBounds() {
        int x;
        for (x = 0; get(x) < nLowerBoundInclusive; x++);
        xLowerBoundInclusive = x;
        for (;get(x) < nUpperBoundExclusive; x++);
        xUpperBoundExclusive = x;
    }

    public int get(int x) {
        return incFun.get(x);
    }

    class FourDigitIterator implements Iterator<Integer> {
        private int x;
        FourDigitIterator() {
            x = xLowerBoundInclusive;
        }

        public boolean hasNext() {
            return (get(x) < nUpperBoundExclusive);
        }

        public Integer next() {
            int oldX = x;
            x++;
            return get(oldX);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FourDigitIterator();
    }
}
