public class NodeUtil {


    public static <T> int size(Node<T> p) {
        int c = 0;

        for(Node<T> n = p; n != null; n = n.getNext()) 
            c++;

        return c;
    }

    public static <T> int sizeRec(Node<T> p) {
        if(p == null) 
            return 0;
        else 
            return 1 + sizeRec(p.getNext());
    }


    public static <T> int occurrences(Node<T> p, T x) {
        int occ = 0;

        for (Node<T> n = p; n != null; n = n.getNext()) {
            if (n.getElem().equals(x))
                occ++;
        }

        return occ;
    }


    public static <T> int occurrencesRec(Node<T> p, T x) {
        if(p == null) 
            return 0;

        if(p.getElem().equals(x)) 
            return 1 + occurrencesRec(p.getNext(), x);

        return occurrencesRec(p.getNext(), x);
    }

    public static <T> boolean included(Node<T> p, Node<T> q) {

        Node<T> x = p;

        for (Node<T> y = q; y != null && x != null; y = y.getNext()) {
            if (x.getElem().equals(y.getElem()))
                x = x.getNext();
        }

        if (x == null)
            return true;

        return false;
    }

    public static <T> boolean includedRec(Node<T> p, Node<T> q) {
        if (p == null)
            return true;

        if (q == null)
            return false;

        if (p.getElem().equals(q.getElem()))
            return includedRec(p.getNext(), q.getNext());

        return includedRec(p, q.getNext());
    }

    public static <T> Node<T> reverse(Node<T> p) {
        // R E D S K U L L (y tho?)

        if (p == null)
            return null;

        Node<T> x = null;

        for (Node<T> n = p; n != null; n = n.getNext())
            x = new Node<T>(n.getElem(), x);

        return x;
    }

    public static <T> Node<T> reverseRec(Node<T> p) {
        return reverseRec(p, null);
    }

    public static <T> Node<T> reverseRec(Node<T> p, Node<T> q) {
        if (p == null) return q;
        return reverseRec(p.getNext(), new Node<T>(p.getElem(), q));
    }

    public static <T> void printList(Node<T> p) {
        if (p == null) {
            System.out.println("Null");
            return;
        }

        String out = "[ ";

        for (Node<T> n = p; n != null; n = n.getNext())
            out = out + n.getElem() + " ";

        out = out + "]";

        System.out.println(out);
    }

    public static <T> void printListRec(Node<T> p) {
        if (p == null) {
            System.out.print("null");
            return;
        }
        System.out.print("[ ");
        printListRec2(p);
        System.out.print("]");
    }

    public static <T> void printListRec2(Node<T> p) {
        if (p == null)
            return;
        System.out.print(p.getElem() + " ");
        printListRec2(p.getNext());
    }

    // ##########################
    // ######## DA FARE #########
    // ##########################


    public static <T> Node<Integer> cardinalityList (Node<Node<T>> arr) {
        // R E D   S K U L L
        if(arr == null || size(arr) == 0) 
            return null;

        Node<Integer> h, t;

        h = new Node<Integer>(size(arr.getElem()), null);
        t = h;

        for(Node<Node<T>> l = arr.getNext(); l != null; l = l.getNext()) {
            t.setNext(new Node<Integer>(size(l.getElem()), null));
            t = t.getNext();
        }


        return h;
    } 

}