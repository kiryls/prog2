import java.util.Iterator;

public class Cons extends List {
    private int elem;
    private List next;

    public Cons(int elem, List next) {
        this.elem = elem;
        this.next = next;
    }

    public int getElem() {
        return elem;
    }

    public List getNext() {
        return next;
    }

    public String toString() {
        return elem + ", " + next.toString();
    }

    public List insert(int n, int x) throws IllegalArgumentException {
        if (x < 0)
            throw new IllegalArgumentException("Negative index");

        if (x == 0)
            return new Cons(n, this);

        try {
            

            return null;



        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e);
            return this;
        }
    }

    public ListIterator iterator() {
        return new ListIterator(this);
    }
}
