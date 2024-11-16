//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// adjacency Matrix = A 2D array to store 1's and 0's to represent edges
        // # of rows = # unique nodes
        // # of column = # unique nodes

Graph graph = new Graph(5); //size of graph is 5
        graph.addNode(new Node('A'));//0
        graph.addNode(new Node('B'));//1
        graph.addNode(new Node('C'));//2
        graph.addNode(new Node('D'));//3
        graph.addNode(new Node('E'));//4


        graph.addEdge(0, 1); // if node A is edge 0, node B is edge 1, it will connect the node 0 and 1 in this way
        graph.addEdge(1, 2); // b->c
        graph.addEdge(2, 3); //c->d
        graph.addEdge(2, 4); //c->e
        graph.addEdge(4, 0); //d->e
        graph.addEdge(4, 2);


        graph.print();
        System.out.println("A->B?");
        System.out.println(graph.checkEdge(0,1)); // check if there is an edge between them
        System.out.println("D->C?");
        System.out.println(graph.checkEdge(3,2));
        System.out.println("C->D?");
        System.out.println(graph.checkEdge(2,3));
        System.out.println("E->A?");
        System.out.println(graph.checkEdge(3,2));

    }
}