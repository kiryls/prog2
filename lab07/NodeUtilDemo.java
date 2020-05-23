public class NodeUtilDemo {
    public static void main(String[] args) {
        Node<Integer> a;
        a = new Node<Integer>(3, null);
        a = new Node<Integer>(2, a);
        a = new Node<Integer>(1, a);

        System.out.print("a: ");
        NodeUtil.printList(a);
        System.out.println(NodeUtil.size(a));

        Node<Integer> b = NodeUtil.reverseRec(a);
        System.out.print("b: ");
        b = new Node<Integer>(7, b);
        NodeUtil.printList(b);
        System.out.println(NodeUtil.size(b));

        Node<Integer> c = null;
        System.out.print("c: ");
        NodeUtil.printList(c);
        System.out.println(NodeUtil.size(c));

        Node<Integer> d;
        d = new Node<Integer>(4, null);
        System.out.print("d: ");
        NodeUtil.printList(d);
        System.out.println(NodeUtil.size(d));
        System.out.println();

        Node<Node<Integer>> listOfLists;
        listOfLists = new Node<Node<Integer>>(d, null);
        listOfLists = new Node<Node<Integer>>(c, listOfLists);
        listOfLists = new Node<Node<Integer>>(b, listOfLists);
        listOfLists = new Node<Node<Integer>>(a, listOfLists);

        Node<Integer> cardList =  NodeUtil.cardinalityList(listOfLists);

        System.out.print("cardList: ");
        NodeUtil.printList(cardList);
    }
}