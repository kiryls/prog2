package lab11;

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
	Random r = new Random();
	// creo un albero con 10 numeri interi casuali
	Tree t = new Leaf();
	for (int i = 0; i < 10; i++)
	    t = t.insert(r.nextInt(20));
	System.out.println("t = " + t);
	System.out.println("t.empty() = " + t.empty());
	System.out.println("t.max() = " + t.max());
	System.out.println("t.contains(6) = " + t.contains(6));
	System.out.println("t.depth() = " + t.depth());
    }
}
