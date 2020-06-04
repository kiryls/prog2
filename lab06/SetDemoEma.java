package lab06;

class SetDemoEma {
    public static void main(String[] args) {
        Set<Integer> s = new Set<>();

        s.add(5);
        s.add(2);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(1);
        s.add(6);

        s.print();
        System.out.println("s.empty() = " + s.empty());
        System.out.println("s.size() = " + s.size()); // stampa 6
        System.out.println("s.contains(4) = " + s.contains(4)); // true
        System.out.println("s.contains(40) = " + s.contains(40)); // false

        System.out.println("removing 6..." + s.remove(6));
        s.print();

        System.out.println("removing 4..." + s.remove(4));
        s.print();

        System.out.println("removing 3..." + s.remove(3));
        s.print();

        System.out.println("removing 2..." + s.remove(2));
        s.print();

        System.out.println("removing 1..." + s.remove(1));
        s.print();

        System.out.println("removing 4..." + s.remove(4));
        s.print();

        System.out.println("removing 5..." + s.remove(5));
        s.print();

        System.out.println("s.empty() = " + s.empty());

        Set<Integer> a = new Set<>();

        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.print();

        Set<Integer> b = new Set<>();
        b.print();
        a.print();
        System.out.println("a subsetOf b..." + a.subsetOf(b));
        System.out.println("b subsetOf a..." + b.subsetOf(a));

        b.add(2);
        b.add(3);
        b.add(0);

        a.print();
        b.print();

        System.out.println("b subsetOf a..." + b.subsetOf(a));
        System.out.println("a subsetOf a..." + a.subsetOf(b));

        b.add(6);
        b.add(3);
        b.add(0);

        a.print();
        b.print();

        System.out.println("b subsetOf a..." + b.subsetOf(a));
        System.out.println("a subsetOf b..." + a.subsetOf(b));

        System.out.println("a equalsTo b..." + a.equalsTo(b));

        Set<Integer> c = new Set<>();
        c.add(5);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(0);
        c.add(6);

        a.print();
        c.print();

        System.out.println("a equalsTo c..." + a.equalsTo(c));
        System.out.println("a union c...");
        a.union(c).print();
        System.out.println("c union a...");
        c.union(a).print();

        c.print();
        b.print();

        System.out.println("c intersection b...");
        c.intersection(b).print();
        System.out.println("c union b...");
        c.union(b).print();

        c.print();
        b.print();

        System.out.println("b union c...");
        b.union(c).print();

        c.print();
        b.print();

    }

}