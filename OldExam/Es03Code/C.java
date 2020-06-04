package OldExam.Es03Code;

public class C extends B {
    public void m1() {
        System.out.println("C.m1");
        super.m1();
    }

    public void m2(A obj) {
        System.out.println("C.m2");
        obj.m1();
    }
}