
public class Cons extends List {
    private int elem;
    private List next;

    protected Cons(int elem, List next) {
        this.elem = elem;
        this.next = next;
    }

    public boolean empty() {
        return false;
    }

    public int size() {
        return 1 + next.size();
    }

    public boolean contains(int x) {
        return x == elem || next.contains(x);
    }

    public List insert(int x) {
        if (x < elem)
            return new Cons(x, this);
        else if (x == elem)
            return this;
        else
            return new Cons(elem, next.insert(x));
    }

    public List append(List l) {
        if (l.empty())
            return this;
        else {
            int x = ((Cons) l).elem;
            List m = ((Cons) l).next;
            return this.insert(x).append(m);
        }
    }

    public String toString() {
        return elem + " " + next.toString();
    }

    // ############################
    // ####### nuovi metodi #######
    // ############################

    public int sum() {
        return this.elem + this.next.sum();
    }

    public int get(int i) {
        assert i >= 0;
        assert i < 1 || !this.next.empty();

        if (i == 0)
            return this.elem;

        return this.next.get(i - 1);
    }

    public List succ() {
        return new Cons(this.elem + 1, this.next.succ());
    }

    public List filter_le(int x) {
        if (this.elem <= x)
            return new Cons(this.elem, this.next.filter_le(x));

        return new Nil();
    }

    public List filter_gt(int x) {
        if (this.elem > x)
            return new Cons(this.elem, this.next.filter_gt(x));

        return this.next.filter_gt(x);
    }

    public List intersectMia(List l) {
        if (l.empty())
            return l;

        if (this.contains(((Cons) l).elem))
            return new Cons(((Cons) l).elem, this.intersectMia(((Cons) l).next));

        return this.intersect(((Cons) l).next);

    }

    public List intersect(List l) {
        if (l.contains(this.elem))
            return new Cons(this.elem, l.intersect(this.next));

        return l.intersect(this.next);
    }
}