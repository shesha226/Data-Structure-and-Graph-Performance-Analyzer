
# Data-Structure-and-Graph-Performance-Analyzer

## Project Description

This project is a console-based Java application developed to demonstrate the practical application of data structures, algorithms, searching, graph concepts, and algorithmic complexity. The system enables users to interact with different data structures, perform relevant operations, and observe performance comparisons.

---

## Project Team & Leadership

- **Project Leader:** Chathura (P. V. R. Chamodya Chathura Sri Bandara)
- **Institution:** Sri Lanka Technology Campus (SLTC)
- **Course Module:** CIT300 Data Structures and Algorithms - Graded Practical Assignment 2

---

## Team Member Names & Student IDs

| Name | Student ID | Role / Designation |
| :--- | :--- | :--- |
| **Chathura (Team Leader)** | **23DA2-0269** | Lead Developer & Array/Searching Module |
| **Prabodha** | **23DA2-0033** | Stack & Queue Module |
| **Paramee** | **22UG3-0148** | Linked List & Graph Module |
| **Shehan** | **23DA2-0374** | Integration, Performance Analyzer & Testing |

---

## Technologies Used

- **Programming Language:** Java
- **Application Type:** Console-Based System
- **Version Control:** Git & GitHub

---

## Main System Features

- **Array Operations:** Insert, delete, search, and display elements.
- **Stack Operations:** Push, pop, peek, and display with underflow handling for empty stacks.
- **Queue Operations:** Enqueue, dequeue, peek/front, and display with underflow handling for empty queues.
- **Linked List Operations:** Insert, delete, search, and display list nodes.
- **Searching Operations:** Linear search and binary search implementations with step count tracking.
- **Graph Component:** Vertex addition, edge addition, graph display, and BFS/DFS traversal algorithms.
- **Performance Comparison:** Step counting and execution time measurement (in nanoseconds) to compare search efficiencies.

---

## Assigned Responsibilities and Individual Contributions

### 1. Chathura (Team Leader)

- **Assigned Responsibility:** Array and Searching implementation (`ArrayStructure.java`, `LinearSearch.java`, `BinarySearch.java`), overall project leadership and coordination.
- **Individual Contribution:**
  - Led the project development team, planned the repository structure, and managed integration tasks.
  - Implemented the array data structure and interactive menu operations (Insert, Delete, Search, Display).
  - Developed and implemented the Linear Search algorithm with step-counting functionality.
  - Developed and implemented the Binary Search algorithm for sorted data collections.
  - Performed thorough testing on array and searching modules.

### 2. Prabodha

- **Assigned Responsibility:** Stack and Queue implementation (`CustomStack.java`, `CustomQueue.java`).
- **Individual Contribution:**
  - Implemented the Stack data structure featuring push, pop, peek, and display operations.
  - Handled stack underflow conditions safely for empty stacks.
  - Implemented the Queue data structure featuring enqueue, dequeue, front/peek, and display operations.
  - Managed underflow conditions for empty queues.
  - Validated and tested stack and queue workflows.

### 3. Paramee

- **Assigned Responsibility:** Linked List implementation, Graph implementation, and traversal (`Node.java`, `CustomLinkedList.java`, `Graph.java`).
- **Individual Contribution:**
  - Implemented the `Node` class to support pointer-based linking.
  - Implemented the Singly Linked List (`CustomLinkedList`) with insertion, deletion, searching, and traversal operations.
  - Implemented the graph data structure using adjacency lists along with vertex and edge management.
  - Implemented Breadth-First Search (BFS) and Depth-First Search (DFS) graph traversal algorithms.
  - Tested linked list and graph module integrations.

### 4. Shehan

- **Assigned Responsibility:** Performance comparison, input validation, main menu, integration, and testing (`PerformanceAnalyzer.java`, `InputValidator.java`, `Main.java`).
- **Individual Contribution:**
  - Implemented robust input validation (`InputValidator`) to handle invalid entries gracefully.
  - Developed the `PerformanceAnalyzer` class to track execution steps and execution times in nanoseconds.
  - Designed and integrated the main console menu (`Main.java`) linking all data structures and analyzers.
  - Integrated all individual modules into a unified system and managed overall repository testing.

---

## Project File Structure

```text
Data-Structure-and-Graph-Performance-Analyzer/
│
├── src/
│   ├── ArrayStructure.java
│   ├── LinearSearch.java
│   ├── BinarySearch.java
│   ├── CustomStack.java
│   ├── CustomQueue.java
│   ├── Node.java
│   ├── CustomLinkedList.java
│   ├── Graph.java
│   ├── PerformanceAnalyzer.java
│   ├── InputValidator.java
│   └── Main.java
│
├── README.md
└── .gitignore
```

---

## Main System Execution Menu

When the application runs successfully, the main menu interface is displayed in the console as follows:

```text
===========================================================
       DATA STRUCTURE & GRAPH PERFORMANCE ANALYZER
===========================================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results Summary
9. Exit
Enter your choice:
```

### 1. Menu Options

1. **Array Operations** – Perform insertion, deletion, searching, and display operations on arrays.
2. **Stack Operations** – Perform push, pop, peek, and display operations.
3. **Queue Operations** – Perform enqueue, dequeue, front/peek, and display operations.
4. **Linked List Operations** – Insert, delete, search, and display linked list elements.
5. **Searching Operations** – Execute linear search and binary search algorithms.
6. **Graph Operations** – Add vertices and edges, display the graph, and perform BFS and DFS traversals.
7. **Performance Comparison** – Compare searching algorithms using step counts and execution time measurements.
8. **Display All Results Summary** – Display a summary of the results generated by the system.
9. **Exit** – Terminate the application.

### 2. Array Operations

The Array Operations menu allows users to manage array elements through the following options:

```text
--- ARRAY OPERATIONS ---
1. Insert Element
2. Delete Element
3. Search Element
4. Display Array
5. Return to Main Menu
```

- **Insert Element:** Add a new element to the array.
- **Delete Element:** Remove an existing element from the array.
- **Search Element:** Search for a specified element in the array.
- **Display Array:** Display the current array elements.
- **Return to Main Menu:** Return to the main system menu.

### 3. Searching Operations

The Searching Operations module provides two searching algorithms:

```text
--- SEARCHING OPERATIONS ---
1. Linear Search
2. Binary Search
```

- **Linear Search:** Searches for a target element by checking array elements sequentially.
- **Binary Search:** Searches for a target element by repeatedly dividing a sorted array into smaller sections.

The searching algorithms can be evaluated using step counts and execution time measurements to compare their performance.

### 4. Graph Operations

The Graph Operations menu enables users to create, manage, and traverse a graph using the following options:

```text
--- GRAPH OPERATIONS ---
1. Add Vertex
2. Add Edge
3. Display Graph
4. BFS Traversal
5. DFS Traversal
6. Return to Main Menu
```

- **Add Vertex:** Add a new vertex to the graph.
- **Add Edge:** Create an edge connecting two vertices.
- **Display Graph:** Display the graph structure and its connections.
- **BFS Traversal:** Traverse the graph using Breadth-First Search (BFS).
- **DFS Traversal:** Traverse the graph using Depth-First Search (DFS).
- **Return to Main Menu:** Return to the main system menu.

These operations demonstrate graph representation, vertex and edge management, and graph traversal algorithms.

---
### 5. Performance Comparison (Sample Output)

When the **Performance Comparison** option is selected, the system displays a comparison of Linear Search, Binary Search, and Graph Traversals (BFS & DFS) based on the number of steps and execution time (in nanoseconds).

**Sample Console Output:**

==================================================
           PERFORMANCE COMPARISON
==================================================
Operation           | Algorithm      | Steps | Time (ns)
--------------------------------------------------
Linear Search: Found at index 999 in 1000 steps.
Binary Search: Found at index 999 in 10 steps.
Search              | Linear Search  | 1000  | 5233800
Search              | Binary Search  | 10    | 1231900
Graph Traversal     | BFS            | 5     | 800
Graph Traversal     | DFS            | 5     | 100
--------------------------------------------------
Explanation: Binary Search O(log n) requires significantly
fewer steps than Linear Search O(n) on sorted data, and graph
traversals visit vertices efficiently based on edge structures.
==================================================

## Instructions for Running the Program

Follow these steps to compile and run the Data Structure and Graph Performance Analyzer application.

### Step 1: Install Java JDK

Ensure that the Java Development Kit (JDK) is installed on your computer. Verify the installation by executing the following commands in the terminal:

```bash
java -version
javac -version
```

### Step 2: Open the Project Directory

Open the project root directory using a terminal or an IDE such as Visual Studio Code.

```bash
cd Data-Structure-and-Graph-Performance-Analyzer
```

### Step 3: Compile the Java Source Files

Compile all Java source files from the project root directory:

```bash
javac src/*.java
```

### Step 4: Run the Application

If the Java files do not declare a package, execute the following command:

```bash
java -cp src Main
```

If the project uses a package declaration, run the application using the appropriate fully qualified class name and classpath.

### Step 5: Interact with the System

After successfully running the application, the main menu will appear in the console. Enter the number corresponding to the required operation and follow the on-screen instructions.

### Step 6: Exit the Application

Select option `9` from the main menu to exit the application safely.

---

## Expected Outcome

The Data Structure and Graph Performance Analyzer provides a practical environment for understanding and evaluating fundamental data structures and algorithms. Users can perform operations on arrays, stacks, queues, linked lists, and graphs while exploring searching algorithms and comparing their performance.

The project demonstrates the application of data structure concepts, algorithm implementation, input validation, modular programming, and performance analysis in Java.

---

## Conclusion

This project demonstrates the practical implementation of fundamental data structures and algorithms using Java. By integrating arrays, stacks, queues, linked lists, searching algorithms, graph traversal techniques, and performance analysis, the system helps users understand algorithm behavior and computational efficiency.

The project also promotes teamwork, modular programming, software integration, testing, and version control through Git and GitHub.