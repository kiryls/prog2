
public class Nil extends List {
    public List insert(int n, int x) throws IllegalArgumentException {
        if (x != 0)
            throw new IllegalArgumentException("Value exceeds the list boundary");

        return new Cons(n, this);
    }

    public String toString() {
        return "";
    }
}