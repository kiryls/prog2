package lab10.EserciziListe;

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
        int sumOfPos = 0;

        for(Node n = this.first; n != null; n = n.getNext())
            if(n.getElem() > 0) 
                sumOfPos += n.getElem();

        this.first = new Node(sumOfPos, this.first);
    }

    public void pushSommaR() {
        first = new Node(pushSommaR(first), first);
    }

    public int pushSommaR(Node n) {
        if (n == null)
            return 0;

        return n.getElem() > 0 ? n.getElem() + pushSommaR(n.getNext()) : pushSommaR(n.getNext());
    }
}
