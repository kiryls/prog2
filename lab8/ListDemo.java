public class ListDemo {
    public static void main(String[] args) {
        List a = new Nil();
        a = a.insert(10).insert(20);
        List b = a.insert(5);
        List c = b.insert(15);
        List d = c.insert(25);
        System.out.println("\n d = " + d);

        System.out.println("\nEsempi di unione di l={1,2} con m={3,4}:");

        List l = new Nil();
        l = l.insert(1).insert(2);

        List m = new Nil();
        m = m.insert(3).insert(4);

        List x = l.append(m);
        System.out.println(" x = " + x);

        System.out.println("x.size() [10] = " + x.sum());

        List y = new Nil();
        System.out.println("y.size() [0] = " + y.size());

        System.out.println("==================== succ() ===================");

        List z = x.succ();
        System.out.println(" x.succ() = " + z);

        System.out.println("==================== filter_le() ===================");

        List le = z.filter_le(3);
        System.out.println(" le3 = " + le);

        System.out.println("==================== filter_gt() ===================");

        List gt = z.filter_gt(3);
        System.out.println(" gt3 = " + gt);

        System.out.println("==================== intersect() ===================");

        System.out.println("le.intersect(gt) []= " + le.intersect(gt));
        System.out.println("x.intersect(z) [2 3 4]= " + x.intersect(z));
    }
}
