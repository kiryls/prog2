package lab05;


public class PilaDinamicaDemo {
    public static void main(String[] args) {
        
        // PilaDinamica p = new PilaDinamica();
        // p.push(3);
        // p.push(1);
        // p.push(4);
        // p.push(2);
        
        // int[] arr = p.toArray();

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // Node h = fromToR(-1, 1);
        // h = new Node(0, h);
        
        // System.out.println("occorrenze 0 in lista: " + occurrencesR(h, 0));


        // p = [1 2 3]
        Node p = new Node(3, null);
        p = new Node(2, p);
        p = new Node(1, p);
        
        // q = [4 5 6]
        Node q = new Node(4, null);
        q = new Node(5, q);
        q = new Node(6, q);
        // q = new Node(2, q);
        // q = new Node(2, q);
        // q = new Node(1, q);
        // q = new Node(0, q);

        // System.out.println("lista [1 2 3] inclusa in [0 1 2 2 0 3 4]: " + includedR(p, q));

        System.out.println("lista p:");
        for(Node x = p; x != null; x = x.getNext()) 
            System.out.println(x.getElem());

        System.out.println("\nlista q:");
        for (Node x = q; x != null; x = x.getNext())
            System.out.println(x.getElem());

        Node s = zipSumR(p, q);

        System.out.println("\nlista s:");
        for (Node x = s; x != null; x = x.getNext())
            System.out.println(x.getElem());
    }

    // ###################
    // ######## 1 ########
    // ###################

    public static Node fromTo(int m, int n) { 
        if(n < m) return null;
        else {
            Node lista = null;// = new Node(n, null);
            for(int i = n; i >= m; i--) {
                lista = new Node(i, lista);
            }
            return lista;
        }
    }

    public static Node fromToR (int m, int n) {
        if(n < m) 
            return null;
        else 
            return fromToR(m, n, null);
    }

    private static Node fromToR(int m, int n, Node l) {
        if (m == n) {
            return new Node(n, l);
        } else {
            l = new Node(n, l);
            return fromToR(m, n - 1, l);
        }
    }

    // ###################
    // ######## 2 ########
    // ###################

    public static int occurrences (Node p, int x) {
        int occ = 0;
        for(Node q = p; q != null; q = q.getNext()) {
            if(q.getElem() == x) occ++;
        }
        return occ;
    }

    public static int occurrencesR (Node p, int x) {
        if(p == null) 
            return 0;
        else {
            if(p.getElem() == x) 
                return 1 + occurrencesR(p.getNext(), x);
            else 
                return 0 + occurrencesR(p.getNext(), x);
        }
    }

    // ###################
    // ######## 3 ########
    // ###################

    public static boolean included (Node p, Node q) {
        // boolean check = true;
        boolean inclusa = false;
        Node x = p;
        Node l;
        for(l = q; l != null && x != null; l = l.getNext()){
            if(x.getElem() == l.getElem() && x != null) x = x.getNext();
        }

        if(x == null) inclusa = true;

        return inclusa;
    }

    public static boolean includedR (Node p, Node q) {
        if(p == null) return true;
        if(q == null && p != null) return false;
        else {
            if(p.getElem() == q.getElem()) 
                return includedR(p.getNext(), q.getNext());
            else 
                return includedR(p, q.getNext());
        } 
    }

    // ###################
    // ######## 4 ########
    // ###################

    public static Node reverse (Node p) {
        if(p == null) return null;

        Node x = null;

        for(Node r = p; r != null; r = r.getNext()) 
            x = new Node(r.getElem(), x);
        
        return x;
    }

    public static Node reverseR (Node p) {
        if(p == null) return null;
        return reverseR(p, null);
    }

    public static Node reverseR (Node p, Node q) {
        if(p == null) return q;

        Node n = new Node(p.getElem(), q);
        return reverseR(p.getNext(), n);
    }

    // ###################
    // ######## 5 ########
    // ###################

    public static Node zipSum (Node p, Node q) {

        if(p == null || q == null) return null;

        Node h = new Node(p.getElem() + q.getElem(), null);
        Node t = h;
        p = p.getNext();
        q = q.getNext();

        while (p != null && q != null) {
            t.setNext(new Node(p.getElem() + q.getElem(), t.getNext()));
            t = t.getNext();
            p = p.getNext();
            q = q.getNext();
        }

        return h;
    }

    public static Node zipSumR (Node p, Node q) {
        if(p == null || q == null) 
            return null;
        else 
            return new Node(p.getElem() + q.getElem(), zipSumR(p.getNext(), q.getNext()));
    }

}