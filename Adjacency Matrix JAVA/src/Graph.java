import java.util.ArrayList;

public class Graph {
    //declare 2D array of integers


    ArrayList<Node> nodes;
    int[][] matrix ;
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size] ;
    }

    public void addNode(Node node){
        nodes.add(node);
    }


    public void addEdge(int src, int dst){
    //source  =  rows
        // destination =  columns
      matrix[src][dst] = 1;

    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1 ){
            return true;
        }
        else {
        return false;
            }
        }

        public void print(){
        System.out.print("  ");  // print the data of each node in the graph
        for(Node node : nodes){
            System.out.print(node.data + " "); // data found in each node
        }
        System.out.print("\n");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data+" ");
            for(int j = 0; j < matrix[i].length; j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
        }

}
