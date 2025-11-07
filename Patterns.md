## 💡 Pattern Identification Table

| Pattern | Java DS/Concept | Identification Cues (What the Question Asks) |
| :--- | :--- | :--- |
| **1. Sliding Window** | `HashMap`, `HashSet`, `Array` (as frequency map) | Asking for the **longest/shortest subarray, substring, or contiguous range** that satisfies a condition. Look for phrases like **max sum**, **min length**, or involving **K distinct/unique elements**. |
| **2. Two Pointers** | `Array`, `String`, `LinkedList` | **1.** Given a **sorted array/list** and asked to find a **pair, triplet, or subsequence** (Pointers move **inward**). **2.** Need to do an **in-place modification** (Pointers move **same direction**). |
| **3. Fast & Slow Pointers** | `LinkedList`, `Array` (for cycle detection) | Dealing with a **Linked List** and asked to **detect a cycle**, find the **middle element**, or determine the **cycle length**. Also applies to finding the **duplicate number** in an array. |
| **4. Two Heaps (Priority Queue)** | `java.util.PriorityQueue` (Min-Heap and Max-Heap) | Processing data in a **stream** (one by one) or needing to maintain the **smallest K** and **largest N-K** elements simultaneously. Classic use: finding the **median** of a running stream. |
| **5. Merge Intervals** | `List<Interval>`, `Collections.sort()` | Dealing with a list of **intervals, ranges, or time blocks** and asked to **overlap, merge, or find intersections**. **ALWAYS** involves sorting the intervals by their start time first. |
| **6. Tree BFS (Level Order)** | `java.util.LinkedList` (used as a `Queue`) | Asking to traverse a **Tree or Graph** and process nodes **level-by-level** or find the **shortest path** (unweighted). |
| **7. Backtracking** | **Recursion**, `List` (for the current path) | Asking for **all possible combinations, permutations, subsets, arrangements, or paths** that satisfy a condition. Look for phrases like "**find all**," or "**generate all**." |
| **8. Dynamic Programming (DP)** | **Memoization** (`HashMap`) or **Tabulation** (`Array/2D Array`) | Problems with **overlapping subproblems** and **optimal substructure**. Look for phrases like **maximum/minimum value**, **number of ways**, or **longest/shortest sequence/path** where a simple recursive approach is too slow. |
| **9. K-way Merge** | `java.util.PriorityQueue` (Min-Heap) | Dealing with **multiple sorted lists, arrays, or streams** and asked to combine, merge, or find the **k-th smallest/largest element** from the combined set. |

---

## ☕ Key Java Collections for High-Performance Solutions

As a Java developer, these are the essential tools that map directly to the patterns above. Utilizing the built-in library features is crucial for clean, efficient, and interview-ready code.

### 1. `java.util.PriorityQueue<T>`

* **Pattern Use:** **Two Heaps, K-way Merge, Top K Elements.**
* **Default Behavior:** **Min-Heap.** Smallest element is at the root.
* **Max-Heap Simulation:** `new PriorityQueue<>(Collections.reverseOrder())` or using a custom comparator.

### 2. `java.util.HashMap<K, V>` / `java.util.HashSet<T>`

* **Pattern Use:** **Sliding Window, Backtracking, DP Memoization.**
* **Function:** Used for $O(1)$ average time lookups, insertions, and deletions. Essential for tracking frequencies (Map) or existence (Set) within a window or during recursion.

### 3. `java.util.LinkedList<T>`

* **Pattern Use:** **Tree/Graph BFS (as a Queue).**
* **Function:** Implement the `Queue` interface efficiently using `add()` and `poll()`.


