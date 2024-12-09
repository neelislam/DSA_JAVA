import java.util.List;
import java.util.LinkedList;

public class Vertex<T> {
    // Generic to store any kind of objects
    private final T data; // store the data
    private boolean visited; // boolean field to track if visited

    private List<Vertex<T>> neighbors = new LinkedList<>();

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
