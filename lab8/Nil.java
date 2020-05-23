
public class Nil extends List {

    public boolean empty() { return true; }

    public int size() { return 0; }

    public boolean contains(int x) { return false; }

    public List insert(int x) { return new Cons(x, this); }

    public List append(List l) { return l; }

    public String toString() { return ""; }

    // ############################
    // ####### nuovi metodi #######
    // ############################

    public int sum() {
        return 0;
    }

    public int get(int i) {
        assert false;
        return 0;
    }

    public List succ() {
        return this;
    }

    public List filter_le(int x) {
        return this;
    }

    public List filter_gt(int x) {
        return this;
    }

    public List intersect(List l) {
        return this;
    }

}

