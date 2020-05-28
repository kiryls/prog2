import java.util.Iterator;

public class ListIterator implements Iterator<Integer> {
    private List next;

    public ListIterator (List next) {
        this.next = next;
    } 

    public boolean hasNext() {
        return !next.empty();
    }

    public Integer next() {
        int x = ((Cons) next).getElem();
        next = ((Cons) next).getNext();
        return x;
    }
}