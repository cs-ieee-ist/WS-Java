public class Node {
    private static int numberOfNodes = 0;
    public int id;
    
    Node() {
        this.id = numberOfNodes++;
    }
}
