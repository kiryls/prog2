package lab10.EserciziListe;

public abstract class List implements Iterable<Integer> {
    public abstract List insert(int n, int x);
    public abstract boolean empty();
}
