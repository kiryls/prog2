
public class Set<T> {
    private Node<T> first;
    private int size;

    public Set() {
        this.first = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return this.first == null;
    }

    public void add(T elem) {
        if(!this.contains(elem)) {
            this.first = new Node<T>(elem, this.first);
            this.size++;
        } 
    }

    public boolean contains(T elem) {
        for (Node<T> p = this.first; p != null; p = p.getNext()) {
            if (p.getElem().equals(elem))
                return true;
        }
        return false;
    }

    public boolean remove(T elem) {
        // T E S C H I O
        if (empty())
            return false;

        Node<T> curr = this.first;
        Node<T> prec = null;

        // rimozione dalla testa
        if (curr.getElem().equals(elem)) {
            this.size--;
            this.first = this.first.getNext();
            return true;
        }

        // rimozione da posizione intermedia
        prec = curr;
        curr = curr.getNext();

        for (; curr != null; prec = curr, curr = curr.getNext()) {
            if (curr.getElem().equals(elem)) {
                this.size--;
                prec.setNext(curr.getNext());
                return true;
            }
        }

        return false;
    }

    public boolean subsetOf(Set<T> s) {

        for (Node<T> n = this.first; n != null; n = n.getNext()) 
            if (!s.contains(n.getElem()))
                return false;
        
        return true;
    }

    public boolean equalsTo(Set<T> s) {
        if(this.size != s.size) return false;
        return s.subsetOf(this) && this.subsetOf(s);
    }

    public Set<T> union(Set<T> s) {

        Set<T> unionSet = new Set<>();

        for (Node<T> n = s.first; n != null; n = n.getNext())
            unionSet.add(n.getElem());

        for (Node<T> n = this.first; n != null; n = n.getNext())
            unionSet.add(n.getElem());

        return unionSet;
    }

    private void fastAdd (T elem) {
        this.first = new Node<T>(elem, this.first);
    }

    public Set<T> intersection(Set<T> s) {
        Set<T> intersect = new Set<>();

        for(Node<T> n = this.first; n != null; n = n.getNext())
            if(s.contains(n.getElem()))
                intersect.fastAdd(n.getElem());

        return intersect;
    }

    public void print() {
        System.out.print("{");
        for (Node<T> n = this.first; n != null; n = n.getNext()) {
            if (n.getNext() == null)
                System.out.print(n.getElem());
            else
                System.out.print(n.getElem() + ", ");
        }
        System.out.print("}\n");
    }

}