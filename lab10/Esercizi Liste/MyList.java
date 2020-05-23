// MyList.java
public class MyList {
    private Node first; // Riferimento al primo nodo della lista

    public MyList() {
        this.first = null;
    }

    public void insert(int elem) {
        first = new Node(elem, first);
    }

    public String toString() {
        String res = "";
        for (Node p = first; p != null; p = p.getNext()) {
            res += p.getElem();
            if (p.getNext() != null)
                res += ", ";
        }
        return res;
    }

    public void modifica() {
        modifica(first, 0);
    }

    private void modifica(Node n, int sum) {
        if (n == null)
            return;

        n.setElem(n.getElem() + sum);
        modifica(n.getNext(), n.getElem());
    }

    public void pushSomma() {
        this.first = new Node(pushSomma(this.first), this.first);
    }

    public int pushSomma(Node n) {
        if (n != null)
            return 0;

        return n.getElem() > 0 ? n.getElem() + pushSomma(n.getNext()) : pushSomma(n.getNext());
    }
}
