import java.util.*;
public class Main {
    public static void main(String[] args) {
        // go to unvisited placed till
        // you reach the end destination
        //back-track

        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));//0
        graph.addNode(new Node('B'));//1
        graph.addNode(new Node('C'));//2
        graph.addNode(new Node('D'));//3
        graph.addNode(new Node('E'));//4


        graph.addEdge(0, 1);
        graph.addEdge(1, 2); // b->c
        graph.addEdge(2, 3); //c->d
        graph.addEdge(2, 4); //c->e
        graph.addEdge(4, 0); //d->e
        graph.addEdge(4, 2);


        graph.print();
        System.out.println("A->B?");
        System.out.println(graph.checkEdge(0,1));
        System.out.println("D->C?");
        System.out.println(graph.checkEdge(3,2));
        System.out.println("C->D?");
        System.out.println(graph.checkEdge(2,3));
        System.out.println("E->A?");
        System.out.println(graph.checkEdge(3,2));


        graph.depthFirstSearch(3);
    }
}







