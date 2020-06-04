package lab10.EserciziListe;

public class MyListDemo {
    public static void main(String[] args) {
        MyList l = new MyList();
        MyList p = new MyList();

        l.insert(2);
        l.insert(9);
        l.insert(4);
        l.insert(1);

        // output : 
        Title.show("original lists");
        System.out.println("l: " + l);
        System.out.println("p: " + p);

        Title.show("l after modifica()"); // 1 5 14 16
        l.modifica();
        System.out.println(l); 

        Title.show("after iterative pushSomma()");
        l.pushSomma();
        p.pushSomma();
        System.out.println("l: " + l);
        System.out.println("p: " + p);

        p.insert(-3);
        p.insert(1);
        p.insert(-1);
        p.insert(4);

        Title.show("adding elements to p");
        System.out.println("p: " + p);

        Title.show("after recursive pushSomma()");
        p.pushSommaR();
        System.out.println("p: " + p);
    }    
}