import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);

        linkedList.add(4,"E");

        System.out.println(linkedList);


        linkedList.remove("C");
        System.out.println(linkedList);

//head and tail node
        System.out.println("Head is:");
        System.out.println(linkedList.peekFirst());
        System.out.println("Tail is:");
        System.out.println(linkedList.peekLast());

        //add anywhere

        linkedList.addFirst("J");
        System.out.println(linkedList);
        linkedList.addLast("K");
        System.out.println(linkedList);


        linkedList.remove("J");
        System.out.println(linkedList);



        //linkedList.poll();
       // System.out.println(linkedList);
    }
}