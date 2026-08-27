# 📘 Graph Basics – Java Notes

> **Goal:** Graph ko dekhkar turant samajhna ki `ArrayList` kaise banani hai aur Topological Sort DFS kaise lagana hai.

---

# 1. Graph ke Basic Terms

Graph mein mainly:

- **Vertex / Node** → graph ka point
- **Edge** → do nodes ke beech connection

Example:

```text
0 → 1
```

Yahan:

```text
0 = u
1 = v

Edge = [0, 1]
```

Matlab:

```text
u → v
```

---

# 2. Graph Input ke Common Forms

Graph problems mein input mostly 3 forms mein milta hai:

### 1. Edge List

```java
int[][] edges = {
    {0, 1},
    {0, 2},
    {1, 3}
};
```

### 2. Adjacency Matrix

```text
0 1 1 0
0 0 0 1
0 0 0 1
0 0 0 0
```

### 3. Adjacency List

```text
0 → [1, 2]
1 → [3]
2 → [3]
3 → []
```

---

# 3. Adjacency List kya hoti hai?

Adjacency List mein har node ke saamne uske neighbours store hote hain.

Example:

```text
0 → 1
0 → 2
1 → 3
2 → 3
```

Adjacency List:

```text
0 → [1, 2]
1 → [3]
2 → [3]
3 → []
```

Java:

```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
```

---

# 4. Empty Adjacency List kaise banaye?

Agar `V` vertices hain:

```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

for (int i = 0; i < V; i++) {
    adj.add(new ArrayList<>());
}
```

### Important

Agar:

```text
V = 4
```

toh initially:

```text
0 → []
1 → []
2 → []
3 → []
```

---

# 5. Edge List → Adjacency List

Suppose:

```java
int[][] edges = {
    {0, 1},
    {0, 2},
    {1, 3},
    {2, 3}
};
```

Meaning:

```text
0 → 1
0 → 2
1 → 3
2 → 3
```

## Directed Graph

Pattern:

```java
adj.get(u).add(v);
```

Complete code:

```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

for (int i = 0; i < V; i++) {
    adj.add(new ArrayList<>());
}

for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];

    adj.get(u).add(v);
}
```

Result:

```text
0 → [1, 2]
1 → [3]
2 → [3]
3 → []
```

## 🧠 Remember

```text
[u, v]

means

u → v
```

So:

```java
adj.get(u).add(v);
```

### One-line memory trick

> **Directed = u se v jao → `adj[u].add(v)`**

---

# 6. Undirected Graph

Undirected graph mein:

```text
0 -- 1
```

ka matlab hai:

```text
0 → 1
1 → 0
```

Isliye dono directions add karni hoti hain:

```java
adj.get(u).add(v);
adj.get(v).add(u);
```

Complete:

```java
for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];

    adj.get(u).add(v);
    adj.get(v).add(u);
}
```

Result:

```text
0 → [1]
1 → [0]
```

## 🧠 Remember

### Directed:

```java
adj.get(u).add(v);
```

### Undirected:

```java
adj.get(u).add(v);
adj.get(v).add(u);
```

> **Undirected = dono taraf connection**

---

# 7. Adjacency Matrix → Adjacency List

Suppose matrix:

```text
0 1 1 0
0 0 0 1
0 0 0 1
0 0 0 0
```

Rule:

```text
matrix[i][j] == 1
```

means:

```text
i → j
```

Example:

```text
matrix[0][1] = 1
```

means:

```text
0 → 1
```

---

## Java Conversion

```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

for (int i = 0; i < V; i++) {
    adj.add(new ArrayList<>());
}

for (int i = 0; i < V; i++) {

    for (int j = 0; j < V; j++) {

        if (matrix[i][j] == 1) {
            adj.get(i).add(j);
        }
    }
}
```

Result:

```text
0 → [1, 2]
1 → [3]
2 → [3]
3 → []
```

## 🧠 Matrix Shortcut

```text
matrix[i][j] == 1
        ↓
     i → j
        ↓
adj.get(i).add(j)
```

---

# 8. Weighted Graph

Suppose:

```text
0 → 1 (5)
0 → 2 (10)
1 → 3 (7)
```

Input:

```java
int[][] edges = {
    {0, 1, 5},
    {0, 2, 10},
    {1, 3, 7}
};
```

Yahan:

```text
edge[0] = u
edge[1] = v
edge[2] = weight
```

So:

```java
int u = edge[0];
int v = edge[1];
int wt = edge[2];
```

Weighted graph mein neighbour ke saath weight bhi store karna padega.

---

# 9. Weighted Graph ka Pair

```java
class Pair {

    int node;
    int weight;

    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
```

Adjacency List:

```java
ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
```

Conversion:

```java
for (int i = 0; i < V; i++) {
    adj.add(new ArrayList<>());
}

for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];
    int wt = edge[2];

    adj.get(u).add(new Pair(v, wt));
}
```

---

# 10. Graph Conversion ka Master Rule 🧠

Graph problem dekhte hi ye 3 questions pucho:

## Question 1: Directed ya Undirected?

### Directed

```java
adj.get(u).add(v);
```

### Undirected

```java
adj.get(u).add(v);
adj.get(v).add(u);
```

---

## Question 2: Weighted ya Unweighted?

### Unweighted

```java
ArrayList<ArrayList<Integer>>
```

### Weighted

```java
ArrayList<ArrayList<Pair>>
```

---

## Question 3: Input kis form mein hai?

### Edges

```java
for (int[] edge : edges)
```

### Matrix

```java
for (int i = 0; i < V; i++) {
    for (int j = 0; j < V; j++) {
        
        if (matrix[i][j] == 1) {
            ...
        }
    }
}
```

---

# 11. Topological Sort

Topological Sort sirf:

> **Directed Acyclic Graph (DAG)**

ke liye valid hota hai.

DAG:

```text
Directed
+
No Cycle
```

Example:

```text
0 → 1 → 3
↓
2 → 3
```

Possible Topological Order:

```text
0 1 2 3
```

ya:

```text
0 2 1 3
```

Dono correct ho sakte hain.

---

# 12. Topological Sort ki Definition

For every edge:

```text
u → v
```

Topological order mein:

```text
u pehle
v baad mein
```

Example:

```text
0 → 1
```

Valid:

```text
0 1
```

Invalid:

```text
1 0
```

---

# 13. Topological Sort using DFS

DFS ka main idea:

1. Node par jao
2. Uske neighbours visit karo
3. Jab saare neighbours complete ho jaayein
4. Node ko Stack mein push karo
5. Finally stack ko pop karo

### Golden Rule ⭐

> **DFS ke END mein node ko Stack mein push karo.**

```java
dfs(neighbour);

stack.push(node);
```

---

# 14. Topological Sort – Complete Java Code

```java
import java.util.*;

class Solution {

    void dfs(
        int node,
        ArrayList<ArrayList<Integer>> adj,
        boolean[] visited,
        Stack<Integer> stack
    ) {

        visited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, stack);
            }
        }

        // DFS complete hone ke baad
        stack.push(node);
    }

    public ArrayList<Integer> topoSort(
        int V,
        int[][] edges
    ) {

        // 1. Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // 2. Convert edges to adjacency list
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }

        // 3. Visited array
        boolean[] visited = new boolean[V];

        // 4. Stack
        Stack<Integer> stack = new Stack<>();

        // 5. DFS
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }

        // 6. Create answer
        ArrayList<Integer> ans = new ArrayList<>();

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }

        return ans;
    }
}
```

---

# 15. Topological Sort ka Dry Run

Graph:

```text
0 → 1
0 → 2
1 → 3
2 → 3
```

Adjacency List:

```text
0 → [1, 2]
1 → [3]
2 → [3]
3 → []
```

DFS:

```text
DFS(0)
  ↓
DFS(1)
  ↓
DFS(3)
  ↓
push(3)

push(1)

DFS(2)
  ↓
3 already visited

push(2)

push(0)
```

Stack:

```text
[3, 1, 2, 0]
```

Pop:

```text
0 2 1 3
```

Valid Topological Order:

```text
0 2 1 3
```

---

# 16. `boolean[] visited` ka role

Ye confusion important hai.

```java
boolean[] visited = new boolean[V];
```

Iska kaam hai:

> **Kya ye node already visit ho chuki hai?**

Example:

```text
visited[0] = true
```

means:

```text
Node 0 visited hai.
```

Ye `boolean` **answer return nahi kar raha**.

Ye sirf tracking ke liye hai.

---

# 17. Topological Sort mein Stack kyun?

Suppose:

```text
0 → 1
```

DFS:

```text
DFS(0)
   ↓
DFS(1)
   ↓
push(1)
   ↓
push(0)
```

Stack mein:

```text
[1, 0]
```

Pop:

```text
0
1
```

Exactly:

```text
0 → 1
```

Isliye:

> **DFS finish order ko reverse karne ke liye Stack use hota hai.**

---

# 18. Complexity

Adjacency List banane mein:

```text
O(E)
```

DFS:

```text
O(V + E)
```

Overall:

```text
Time = O(V + E)
Space = O(V + E)
```

---

# 🧠 FINAL REVISION CHEAT SHEET

## Edge List → Directed

```java
for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];

    adj.get(u).add(v);
}
```

## Edge List → Undirected

```java
for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];

    adj.get(u).add(v);
    adj.get(v).add(u);
}
```

## Matrix → Directed

```java
for (int i = 0; i < V; i++) {

    for (int j = 0; j < V; j++) {

        if (matrix[i][j] == 1) {
            adj.get(i).add(j);
        }
    }
}
```

## Weighted Graph

```java
int u = edge[0];
int v = edge[1];
int wt = edge[2];

adj.get(u).add(new Pair(v, wt));
```

## Topological Sort DFS

```java
visited[node] = true;

for (int neighbour : adj.get(node)) {

    if (!visited[neighbour]) {
        dfs(neighbour, adj, visited, stack);
    }
}

stack.push(node);
```

---

# ⭐ 5 Lines jo hamesha yaad rakhni hain

### 1. Directed

```java
adj.get(u).add(v);
```

### 2. Undirected

```java
adj.get(u).add(v);
adj.get(v).add(u);
```

### 3. Matrix

```java
if (matrix[i][j] == 1)
```

means:

```text
i → j
```

### 4. Topological DFS

```java
dfs(neighbour);
stack.push(node);
```

### 5. Topological Sort

> **DFS karo → neighbours complete karo → node stack mein daalo → stack pop karo.**

---

# 🎯 One-Minute Graph Thinking

Jab bhi graph question aaye:

```text
INPUT
  ↓
Edges ya Matrix?
  ↓
Directed ya Undirected?
  ↓
Weighted ya Unweighted?
  ↓
Adjacency List banao
  ↓
DFS / BFS / Topological Sort / Dijkstra...
```

**Bas pehle graph ko sahi representation mein convert karo.**

Uske baad algorithm lagana kaafi easy ho jaata hai.