import java.util.Iterator;

public class ListIterator implements Iterator<Integer> {
    private Cons next;

    public ListIterator (List next) {
        this.next = (Cons)next;
    } 

    public boolean hasNext() {
        return next != null;
    }

    public Integer next() {
        int x = next.getElem();
        next = (Cons)next.getNext();
        return x;
    }
}