import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AdjacencyListGraph {

    // Like a dictionary we have a key and a value
    public HashMap<Node, ArrayList<Node>> map = new HashMap<>();

    AdjacencyListGraph() {
    }

    public void addNode(Node n) {
        // If already exists
        if (this.map.containsKey(n)) {
            return;
        }
        this.map.put(n, new ArrayList<>());
    }

    public void addEdge(Node origin, Node destination) {
        ArrayList<Node> list = this.map.get(origin);
        if (!list.contains(destination)) {
            list.add(destination);
        }
    }

    public void print() {
        System.out.println("Adjacency List Graph");
        Iterator<Node> it = this.map.keySet().iterator();
        while(it.hasNext()) {
            Node n = it.next();
            System.out.print(n.id + " -> ");
            ArrayList<Node> adjList = this.map.get(n);
            for (int i = 0; i < adjList.size(); i++) {
                System.out.print(adjList.get(i).id + ", ");
            }
            System.out.println("");
        }
    }
}
