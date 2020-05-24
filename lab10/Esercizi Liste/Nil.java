public class Nil extends List {
    public List insert(int n, int x) {
        /* COMPLETARE */
        if(x > 0)
            throw new Error("Value exceeds the list bound");
            
        return new Cons(n, this);
    }

    public String toString() {
        return "";
    }
}