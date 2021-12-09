import java.util.ArrayList;
import java.util.Stack;


public class Main {
  public static void main(String[] args) {
    if (args.length > 0) {
      if (args[0].equals("ex1")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        company.listActiveEmployees();
      } else if (args[0].equals("ex2")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        Chief c1 = new Chief("Antonio", Position.CEO);
        company.hireEmployee(c1);
        company.listActiveEmployees();
      } else if (args[0].equals("ex3")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        Chief c1 = new Chief("Antonio", Position.CEO);
        company.hireEmployee(c1);
        
        e1.addAttendance();
        e1.addAttendance();
        e1.addAttendance();
        e2.addAttendance();
        e2.addAttendance();
        e2.addAttendance();
        c1.addAttendance();
        e1.addAttendance();

        company.listAttendances();
      } else if (args[0].equals("graph1")) {
        AdjacencyListGraph graph = new AdjacencyListGraph();
        Node n1 = new Node();
        graph.addNode(n1);
        Node n2 = new Node();
        graph.addNode(n2);
        Node n3 = new Node();
        graph.addNode(n3);
        Node n4 = new Node();
        graph.addNode(n4);
        graph.addEdge(n1, n2);
        graph.addEdge(n1, n4);
        graph.addEdge(n2, n4);
        graph.addEdge(n3, n1);
        graph.addEdge(n4, n3);
        graph.print();

        // Depth First Search
        Stack<Node> stack = new Stack<>();
        ArrayList<Node> visited = new ArrayList<>();
        Node currNode;
        stack.push(n1);
        while (stack.size() > 0) {
          currNode = stack.pop();
          if (visited.contains(currNode)) { // skip visited nodes
            continue;
          }
          System.out.println("Visit Node: " + currNode.id);
          visited.add(currNode);
          ArrayList<Node> adjList = graph.map.get(currNode);
          stack.addAll(adjList);
        }
      }
      else if (args[0].equals("graph2")) {
        int numberOfNodes = 4;
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(numberOfNodes);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 3, 4);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 0, 1);
        graph.addEdge(3, 2, 8);
        graph.print();
        
        // Depth First Search

        int currNode = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> visited = new ArrayList<>();
        stack.push(currNode);
        while (stack.size() > 0) {
          currNode = stack.pop();
          if (visited.contains(currNode)) { // skip visited nodes
            continue;
          }
          System.out.println("Visit Node: " + currNode);
          visited.add(currNode);
          int[] adjList = graph.matrix[currNode];
          for (int i = 0; i < graph.numberOfNodes; i++) {
            if (adjList[i] != 0) {
              stack.add(i);
            }
          }
        }

      } else {
        System.out.println("Invalid example");
      }  
    } else {
      String a = "Hello World";
      int b = 1;
      float c = (float) 1.1;
      char d = '\n';
      boolean e = true;
      System.out.println(a);
    }
  }
}