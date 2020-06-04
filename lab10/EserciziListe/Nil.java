package lab10.EserciziListe;


public class Nil extends List {
    public List insert(int n, int x) throws IllegalArgumentException {
        if (x != 0)
            throw new IllegalArgumentException("Failing insert [" + n + "] @ [" + x + "]");

        return new Cons(n, this);
    }

    public boolean empty() { return true; }

    public String toString() {
        return "";
    }

    public ListIterator iterator() {
        return new ListIterator(this);
    }
}