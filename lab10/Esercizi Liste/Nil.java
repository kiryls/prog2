public class Nil extends List {
    public List insert(int n, int x) {
        /* COMPLETARE */
        return new Cons(n, this);
    }

    public String toString() {
        return "";
    }
}