public class NilConsDemo {
    public static void main(String[] args) {
        List l = new Nil();

        Title.show("iteratore su lista vuota");
        for (Integer i : l)
            System.out.println(i);
        System.out.println("(se non stampa nulla e' perche' la lista e' vuota)");

        Title.show("inserimenti non ammessi");
        try {
           l = l.insert(2, -1);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        try {
            l = l.insert(2, 42);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        Title.show("insert e stampa col for-each");
        l = l.insert(4, 0);
        l = l.insert(1, 0);
        l = l.insert(3, 1);

        String output = "[";

        for (Integer i : l)
            output += " " + i + " ";
        output += "]";

        System.out.println(output);
       
    }
}