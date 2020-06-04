package lab06;


public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new Set<>();

        s.add(5);
        s.add(2);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(1);
        s.add(6);

        System.err.print("s = ");
        s.print();
        System.out.println("s.empty() = " + s.empty());
        System.out.println("s.size() = " + s.size()); // stampa 6
        System.out.println("s.contains(4) = " + s.contains(4)); // true
        System.out.println("s.contains(40) = " + s.contains(40)); // false
        System.out.println("removing 1..." + s.remove(1)); //true
        System.err.print("s = ");
        s.print(); // { 5 2 4 3 6 }

        System.out.println("\n############################################");
        System.out.println("############ OPERAZIONI TRA SET ############");
        System.out.println("############################################\n");

        Set<Integer> t = new Set<>();
        t.add(4);
        t.add(3);
        t.add(6);

        System.out.println("\n####################");
        System.out.println("##### subsetOf #####");
        System.out.println("####################\n");

        System.out.print("t = ");
        t.print(); // { 4 3 1 6 }
        System.out.print("s = ");
        s.print();
        System.out.println("s is subset of t: " + s.subsetOf(t)); // false
        System.out.println("t is subset of s: " + t.subsetOf(s)); // true

        System.out.println("\n####################");
        System.out.println("##### equalsTo #####");
        System.out.println("####################\n");

        t.add(5);
        t.add(2);
        System.out.print("t = ");
        t.print();
        System.out.print("s = ");
        s.print();
        // stessi size & elementi quindi true
        System.out.println("t == s: " + t.equalsTo(s)); // true
        System.out.println("s == t: " + s.equalsTo(t) + "\n"); // true

        // se size != allora false
        t.remove(5);
        System.out.print("t = ");
        t.print();
        System.out.print("s = ");
        s.print();
        System.out.println("t == s: " + t.equalsTo(s)); // false
        System.out.println("s == t: " + s.equalsTo(t) + "\n"); // false

        // stesso size ma elementi !=
        t.add(7);
        System.out.print("t = ");
        t.print();
        System.out.print("s = ");
        s.print();
        System.out.println("t == s: " + t.equalsTo(s)); // false
        System.out.println("s == t: " + s.equalsTo(t)); // false

        System.out.println("\n#################");
        System.out.println("##### union #####");
        System.out.println("#################\n");

        Set<Integer> u = s.union(t);
        System.out.print("s = ");
        s.print();
        System.out.println("union");
        System.out.print("t = ");
        t.print();
        System.out.println("=");
        System.out.print("u = ");
        u.print();

        System.out.println("\n########################");
        System.out.println("##### intersection #####");
        System.out.println("########################\n");

        Set<Integer> i = s.intersection(t);
        System.out.print("s = ");
        s.print();
        System.out.println("intersection");
        System.out.print("t = ");
        t.print();
        System.out.println("=");
        System.out.print("i = ");
        i.print();
        
    }
}