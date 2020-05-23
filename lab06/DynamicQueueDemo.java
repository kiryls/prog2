import java.util.HashSet;

public class DynamicQueueDemo {
    public static void main(String[] args) {
        {
        // DynamicQueue<Integer> q = new DynamicQueue<Integer>();
        // System.out.println("q = {17,42,4} ");
        // q.enqueue(17);
        // q.enqueue(42);
        // q.enqueue(4);
        // q.scriviOutput();

        // System.out.println("q.empty() = " + q.empty());
        // System.out.println("q.contains(4)  = " + q.contains(4)); // true  quindi, con Person non funziona questo?
        // System.out.println("q.contains(40) = " + q.contains(40));// false
        // System.out.println("q.size() = " + q.size()); // stampa 3
        // System.out.println("q.front()= " + q.front()); // stampa 17
        // System.out.println(q.dequeue()); // toglie e stampa 17
        // System.out.println(q.dequeue()); // toglie e stampa 42
        // System.out.println(q.dequeue()); // toglie e stampa 4: coda vuota

        // // gli elementi vengono stampati nello stesso ordine in cui
        // // sono stati inseriti, dal momento che la coda e' una
        // // struttura FIFO (First-In-First-Out)
        // System.out.println("q.empty() = " + q.empty());
        }
        // ###################
        // ##### Persona #####
        // ###################

        // DynamicQueue<Person> r = new DynamicQueue<Person>();
        // Person a = new Person("anna", "prima");
        // Person b = new Person("beatrice", "seconda");
        // Person c = new Person("chiara", "terza");

        // r.enqueue(a);
        // r.enqueue(b);
        // r.enqueue(c);

        // r.scriviOutput();

        // Person chiara = new Person("chiara", "terza");
        // HashSet<Person> x = new HashSet<>();
        // x.add(c);
        // System.out.println(x.contains(chiara)); 


        // System.out.println("r.empty() = " + r.empty());
        // System.out.println("r.contains(\"chiara, terza\") = " + r.contains(chiara)); // true
        // System.out.println("r.contains(\"Kiryl, Shvachka\") = " + r.contains(new Person("Kiryl", "Shvachka")));// false
        // System.out.println("r.size() = " + r.size()); // stampa 3
        // System.out.println("r.front()= " + r.front()); // stampa 17
        // System.out.println(r.dequeue()); // toglie e stampa 17
        // System.out.println(r.dequeue()); // toglie e stampa 42
        // System.out.println(r.dequeue()); // toglie e stampa 4: coda vuota

        // System.out.println("r.empty() = " + r.empty());

    }
}
