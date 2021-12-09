import java.util.ArrayList;

public class AdjacencyMatrixGraph {

    // Matrix of edges indexed by node id, each position is a weight
    public int[][] matrix;
    public int numberOfNodes;
    public ArrayList<Node> nodes = new ArrayList<>();

    AdjacencyMatrixGraph(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        this.matrix = new int[numberOfNodes][numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            this.nodes.add(new Node());
        }
    }

    public void addEdge(int originId, int destinationId, int weight) {
        matrix[originId][destinationId] = weight;
    }

    public void print() {
        System.out.println("Adjacency Matrix Graph");
        for (int i = 0; i < this.numberOfNodes + 1; i++) {
            for (int j = 0; j < this.numberOfNodes + 1; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print(" |");
                    } else {
                        System.out.print(" " + (j-1) + " |");
                    }
                } else if (j == 0) {
                    System.out.print((i-1) + "|");
                } else {
                    System.out.print(" " + this.matrix[i-1][j-1] + "  ");
                }
            }
            System.out.println("");
        }
    }
}
