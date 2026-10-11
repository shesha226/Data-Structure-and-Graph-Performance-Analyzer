package src;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            
            int choice = InputValidator.getIntInput(scanner, "Enter choice: ");

            if (choice == 6) break;

            switch (choice) {
                case 1:
                    int v = InputValidator.getIntInput(scanner, "Enter vertex ID (integer): ");
                    adjList.putIfAbsent(v, new ArrayList<>());
                    System.out.println("Vertex added.");
                    break;
                case 2:
                    int src = InputValidator.getIntInput(scanner, "Enter source vertex: ");
                    int dest = InputValidator.getIntInput(scanner, "Enter destination vertex: ");
                    adjList.putIfAbsent(src, new ArrayList<>());
                    adjList.putIfAbsent(dest, new ArrayList<>());
                    adjList.get(src).add(dest);
                    adjList.get(dest).add(src);
                    System.out.println("Edge added.");
                    break;
                case 3:
                    System.out.println("\nAdjacency List:");
                    for (var entry : adjList.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;
                case 4:
                    int startBfs = InputValidator.getIntInput(scanner, "Enter start vertex for BFS: ");
                    bfs(startBfs);
                    break;
                case 5:
                    int startDfs = InputValidator.getIntInput(scanner, "Enter start vertex for DFS: ");
                    dfs(startDfs);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void bfs(int start) {
        if (!adjList.containsKey(start)) { System.out.println("Vertex not found."); return; }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        if (!adjList.containsKey(start)) { System.out.println("Vertex not found."); return; }
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}