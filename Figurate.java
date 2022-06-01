package problem61;

public abstract class Figurate {
    public abstract int get(int x);
    public abstract int sides();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Figurate)) return false;
        return (((Figurate) o).sides() == this.sides());
    }

    @Override
    public int hashCode() {
        return sides();
    }
}
