# 🚀 Alpha - Java Data Structures & Algorithms (DSA) Library

Welcome to **Alpha**, a comprehensive and highly organized repository containing **96 Java-based solutions and implementations** of fundamental and advanced Data Structures and Algorithms (DSA). This library is structured to serve as both an educational resource for understanding core CS concepts and a reference repository for competitive programming and coding interview preparation.

---

## 📊 Repository Overview

This repository contains clean, self-contained Java source files. Each file is equipped with a `main` runner method, allowing you to run and debug the solutions immediately.

*   **Language:** Java (`.java`)
*   **Total Files:** 96 implementations
*   **Target Scope:** Arrays, Matrices, Recursion, Backtracking, Sorting, Linked Lists, Stacks, Queues, Binary Trees, Binary Search Trees (BST), Greedy Algorithms, Bit Manipulation, and Strings.

---

## 🔍 Index of Implementations

### 1. 🔗 Linked Lists
Custom and problem-oriented singly linked list implementations including traversal, rotation, intersection, and Floyd's cycle detection.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`LLUnderstand.java`](src/LLUnderstand.java) | Custom implementation of a Singly Linked List including insertion, deletion, linear/recursive search, list reversal, middle node detection, and zigzag merging. | Core Structures & Algorithms |
| [`LLAddTwo002.java`](src/LLAddTwo002.java) | Add two numbers represented as linked lists (sum digits in reverse order). | LeetCode 2 |
| [`LLDeleteNNodeAfterMNode1474.java`](src/LLDeleteNNodeAfterMNode1474.java) | Delete $N$ nodes after keeping $M$ nodes iteratively. | LeetCode 1474 |
| [`LLIntersection160.java`](src/LLIntersection160.java) | Find the node at which the intersection of two singly linked lists begins. | LeetCode 160 |
| [`LLIsItCycle141.java`](src/LLIsItCycle141.java) | Detect whether a linked list contains a cycle using Floyd's Cycle-Finding Algorithm. | LeetCode 141 |
| [`LLMergeTwoSortedLists21.java`](src/LLMergeTwoSortedLists21.java) | Merge two sorted linked lists into a single sorted list. | LeetCode 21 |
| [`LLOddEven.java`](src/LLOddEven.java) | Separate elements in a linked list into odd and even numbers. | Custom Partition |
| [`LLOddEvenIndex328.java`](src/LLOddEvenIndex328.java) | Group all nodes with odd indices followed by nodes with even indices. | LeetCode 328 |
| [`LLPalindrome234.java`](src/LLPalindrome234.java) | Check if a singly linked list is a palindrome by reversing the second half. | LeetCode 234 |
| [`LLRemoveDuplicates83.java`](src/LLRemoveDuplicates83.java) | Remove duplicate elements from a sorted linked list. | LeetCode 83 |
| [`LLRemoveLinkedListElements203.java`](src/LLRemoveLinkedListElements203.java) | Remove all elements that have a specific value from a linked list. | LeetCode 203 |
| [`LLReverseLL92.java`](src/LLReverseLL92.java) | Reverse a portion of a singly linked list from position left to right. | LeetCode 92 |
| [`LLSwap.java`](src/LLSwap.java) | Swap nodes in a linked list. | Node Swapping |
| [`LLSwap1721.java`](src/LLSwap1721.java) | Swap the values of the $k$-th node from the beginning and the $k$-th node from the end. | LeetCode 1721 |
| [`DeleteNode237.java`](src/DeleteNode237.java) | Delete a node in a linked list given access only to that node. | LeetCode 237 |
| [`RotateList61.java`](src/RotateList61.java) | Rotate the linked list to the right by $k$ places. | LeetCode 61 |

---

### 2. 🥞 Stacks & Queues
LIFO and FIFO structures custom-built and simulated using various wrappers (e.g., standard arrays, linked lists, and Collections).

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`StackOperations.java`](src/StackOperations.java) | Basic custom stack implementation using `ArrayList` supporting standard stack operations. | Core Stack Operations |
| [`StackDuplicateParentheses.java`](src/StackDuplicateParentheses.java) | Check if a given mathematical expression contains redundant/duplicate parentheses. | Stack Validation |
| [`StackHistogramRectangle.java`](src/StackHistogramRectangle.java) | Calculate the maximum rectangular area of a histogram. | Monotonic Stack |
| [`StackNextGreaterElement.java`](src/StackNextGreaterElement.java) | Find the next greater element for every array element. | Monotonic Stack |
| [`StackStockSpan.java`](src/StackStockSpan.java) | Calculate the span of stock prices (consecutive days with price $\le$ current day). | Monotonic Stack |
| [`StackUsingQueue225.java`](src/StackUsingQueue225.java) | Implement a last-in-first-out (LIFO) stack using queues. | LeetCode 225 |
| [`StackValidParentheses.java`](src/StackValidParentheses.java) | Determine if the input string parenthetical symbols are validly nested. | LeetCode 20 |
| [`SimplifyString71.java`](src/SimplifyString71.java) | Convert a Unix-style absolute path to its simplified canonical path. | LeetCode 71 |
| [`DesignCircularQueue622.java`](src/DesignCircularQueue622.java) | Design an efficient circular queue using a fixed-size array. | LeetCode 622 |
| [`Dota2Senate649.java`](src/Dota2Senate649.java) | Solve voting round outcomes for Dota2 Senate faction members. | LeetCode 649 |
| [`QCircularUsingArray.java`](src/QCircularUsingArray.java) | Custom implementation of a Circular Queue using primitive arrays. | Queue Implementation |
| [`QDequeStack.java`](src/QDequeStack.java) | Implement both standard Stack and Queue behaviors using the `Deque` interface. | Deque Wrapper |
| [`QFirstNonRepeatingLetter.java`](src/QFirstNonRepeatingLetter.java) | Find the first non-repeating character in a stream of characters on the fly. | Queue / Map |
| [`QMakingStackWithTwoQ.java`](src/QMakingStackWithTwoQ.java) | Custom LIFO stack using two FIFO queues. | Stack Simulation |
| [`QMakingUsingTwoStacks.java`](src/QMakingUsingTwoStacks.java) | Custom FIFO queue using two LIFO stacks. | Queue Simulation |
| [`QReverse.java`](src/QReverse.java) | Reverse all elements in a queue using a helper stack or recursive calls. | Queue Reversal |
| [`QUsingArray.java`](src/QUsingArray.java) | Custom linear queue implementation using standard array indexing. | Queue Implementation |
| [`QUsingJCF.java`](src/QUsingJCF.java) | Basic queue usage demonstration using the Java Collections Framework. | JCF Tutorial |
| [`QueueUsingLL.java`](src/QueueUsingLL.java) | Custom queue implementation backed by a singly linked list. | Dynamic Queue |
| [`Sandwich1700.java`](src/Sandwich1700.java) | Count students unable to get a sandwich based on circular/square preferences. | LeetCode 1700 |

---

### 3. 🌳 Trees & Binary Search Trees (BST)
Trees construction, depth-first/breadth-first traversals, mirroring, and search tree validation operations.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`BinaryTreeFirstPre.java`](src/BinaryTreeFirstPre.java) | Complete Binary Tree utility implementing traversals (Preorder, Inorder, Postorder, Level Order), tree height/count/sum, diameter tracking, subtree checker, top-view node tracking, and $k$-th level queries. | Binary Tree Foundation |
| [`BSTPart1.java`](src/BSTPart1.java) | Custom BST operations: building, in-order print, node searching, node deletion (three cases), printing range, root-to-leaf paths, mirroring, and validation. | BST Foundation |
| [`BSTPart2.java`](src/BSTPart2.java) | Advanced BST operations including sorted Array/ArrayList conversion to a Balanced BST. | Balanced BST |
| [`BSTMergeBST.java`](src/BSTMergeBST.java) | Merge two independent BSTs into a single balanced Binary Search Tree. | Tree Merging |
| [`BSTSizeOfLargestBSTInBT.java`](src/BSTSizeOfLargestBSTInBT.java) | Find the size of the largest sub-BST nested inside any arbitrary Binary Tree. | Tree DP / Validation |

---

### 4. 🔄 Backtracking & Recursion
State-space search strategies for puzzles, combinatorics, and dynamic recurrence solving.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`BTFindPermutations.java`](src/BTFindPermutations.java) | Backtracking to generate and print all permutations of a string. | Permutation Generation |
| [`BTFindSubset.java`](src/BTFindSubset.java) | Backtracking to generate and print all unique power set subsets of a string. | Subset Generation |
| [`BTNQueens.java`](src/BTNQueens.java) | Solve and print all valid board states for the classic $N$-Queens puzzle. | Backtracking / N-Queens |
| [`BTinArray.java`](src/BTinArray.java) | Demonstration of array filling and element manipulation during backtracking stack unwinding. | Backtracking Basics |
| [`SudokuSolver.java`](src/SudokuSolver.java) | Solve 9x9 Sudoku puzzles using recursive backtracking. | Sudoku Solver |
| [`Recursions.java`](src/Recursions.java) | Fundamental recursive templates: print numbers, factorial, Fibonacci numbers, array sorting verification, first/last element indices. | Recursion Basics |
| [`RecursionFriendsPairingProblem.java`](src/RecursionFriendsPairingProblem.java) | Calculate the number of ways $N$ friends can stay single or pair up recursively. | Combinatorics / DP |
| [`RecursionPower.java`](src/RecursionPower.java) | Calculate $X^N$ efficiently using recursive binary exponentiation $O(\log N)$ and linear $O(N)$ approaches. | Binary Exponentiation |
| [`RecursionTailingProb.java`](src/RecursionTailingProb.java) | Solve the board tiling problem for a $2 \times N$ floor using $2 \times 1$ tiles. | Fibonacci-like Recurrence |

---

### 5. 💰 Greedy Algorithms
Opting for the locally optimal choice at each stage to solve complex global optimization problems.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`GBalancedSplit1221.java`](src/GBalancedSplit1221.java) | Split string into maximum number of balanced 'L' and 'R' substrings. | LeetCode 1221 |
| [`GChocolateProblem.java`](src/GChocolateProblem.java) | Solve the board-cutting puzzle: slice a chocolate bar into squares with minimal cost. | Greedy Cost Minimization |
| [`GIndianCoins.java`](src/GIndianCoins.java) | Determine minimum number of coins/notes needed to make change (canonical denominations). | Greedy Coin Change |
| [`GKthLargestOdd.java`](src/GKthLargestOdd.java) | Find the $K$-th largest odd number in a specified numeric range. | Math / Greedy Selection |
| [`Patches330.java`](src/Patches330.java) | Find minimum patches required to an array to form all numbers in $[1, n]$. | LeetCode 330 |

---

### 6. 🗃️ ArrayLists & 1D/2D Arrays
Storage components, multi-dimensional traversal methods, two-pointer techniques, and matrix manipulation.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`ALBeautiful932.java`](src/ALBeautiful932.java) | Construct a beautiful array where no element is the average of two others. | LeetCode 932 (Divide & Conquer) |
| [`ALLonelyNum.java`](src/ALLonelyNum.java) | Find all "lonely" numbers in an array (only occur once, adjacent numbers not present). | ArrayList Search |
| [`ALMaximumTrapWater.java`](src/ALMaximumTrapWater.java) | Solve the Container with Most Water problem using standard and two-pointer ArrayList approaches. | Two-Pointer |
| [`ALMonotonic896.java`](src/ALMonotonic896.java) | Verify if an ArrayList is monotonically increasing or decreasing. | LeetCode 896 |
| [`ALPairSum.java`](src/ALPairSum.java) | Find if any pair in a sorted or rotated sorted ArrayList sums up to a target value. | Two-Pointer |
| [`ALReverse.java`](src/ALReverse.java) | Basic utilities: reverse, find maximum, swap, and sort ArrayList elements. | ArrayList Basics |
| [`TwoDAL.java`](src/TwoDAL.java) | Manipulation of nested (two-dimensional) ArrayLists. | Multi-dimensional lists |
| [`ArrayPractice.java`](src/ArrayPractice.java) | Comprehensive array assignments: search (linear/binary), subarrays, buy-sell stocks, container water. | Array Practice |
| [`DiagonalMatrixSum.java`](src/DiagonalMatrixSum.java) | Calculate primary and secondary diagonal elements' sum of a 2D matrix in $O(N)$ time. | Matrix Traversal |
| [`DistanceCalculator1848.java`](src/DistanceCalculator1848.java) | Find the minimum absolute distance index containing target element. | LeetCode 1848 |
| [`DuplicateElement.java`](src/DuplicateElement.java) | Detect if any element appears at least twice in a standard array. | Array Hashing |
| [`MissingEle.java`](src/MissingEle.java) | Find missing integers in a sequence. | Math / Array |
| [`MostFrequentNumberFollowingKey.java`](src/MostFrequentNumberFollowingKey.java) | Find key successor value which has the highest occurrence count. | LeetCode 2190 |
| [`RotateImage48.java`](src/RotateImage48.java) | Rotate a 2D matrix clockwise by 90 degrees in-place. | LeetCode 48 |
| [`RotatedSortedArray.java`](src/RotatedSortedArray.java) | Search for an element inside a rotated sorted array. | Binary Search |
| [`SpiralMatrix.java`](src/SpiralMatrix.java) | Print 2D matrix components in outer-to-inner spiral order. | LeetCode 54 |
| [`StairCaseSearchMatrix.java`](src/StairCaseSearchMatrix.java) | Search in a row-wise and column-wise sorted 2D matrix starting from top-right. | Staircase Search $O(N+M)$ |
| [`Teemo495.java`](src/Teemo495.java) | Calculate total duration of poison state based on time series attacks. | LeetCode 495 |
| [`TripletEqualZero.java`](src/TripletEqualZero.java) | Find unique triplets that sum up to zero. | Three-Pointer / Sorting |
| [`TwoDArray.java`](src/TwoDArray.java) | Basic operations on standard 2D arrays (input, output, and element search). | 2D Arrays |
| [`TwoSum01BruteForce.java`](src/TwoSum01BruteForce.java) | Find indices of two numbers that add up to target. | LeetCode 1 |
| [`TwoSumForSortedArray.java`](src/TwoSumForSortedArray.java) | Find indices of two numbers adding to target inside a sorted array. | Two-Pointer |

---

### 7. ⚡ Sorting & Bit Manipulation
Standard $O(N^2)$ and divide-and-conquer $O(N \log N)$ sorting routines alongside fast bitwise checking/manipulation algorithms.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`Sorting.java`](src/Sorting.java) | Standard basic sorting algorithm implementations: Bubble Sort, Selection Sort, Insertion Sort, Counting Sort. | Basic Sorting |
| [`MergeSort.java`](src/MergeSort.java) | Divide-and-conquer sorting algorithm. | $O(N \log N)$ Sorting |
| [`QuickSort.java`](src/QuickSort.java) | In-place partition-based sorting algorithm. | $O(N \log N)$ Average Sorting |
| [`BitIthOperation.java`](src/BitIthOperation.java) | Perform basic bitwise manipulations: get, set, clear, update, clear range of bits, power of 2 checks. | Bit Operations |
| [`BitOddOrEven.java`](src/BitOddOrEven.java) | Fast check for odd/even properties of a number using bitwise AND `& 1`. | Bitwise check |

---

### 8. 🔤 Strings & Utilities
String optimization utilizing `StringBuilder`, character map lookups, palindrome verification, and runtime timing helpers.

| File | Description | Key Concept / LeetCode |
| :--- | :--- | :--- |
| [`StringPrac.java`](src/StringPrac.java) | Basic string operations, direction displacement calculations, palindrome validation. | String Basics |
| [`StringCompression.java`](src/StringCompression.java) | Compress string repeats in-place (e.g. "aaabbc" -> "a3b2c"). | LeetCode 443 |
| [`FirstStringBuilder.java`](src/FirstStringBuilder.java) | Fast append operations using `StringBuilder` compared to immutable strings. | Java Optimization |
| [`FirstLetterUpperCase.java`](src/FirstLetterUpperCase.java) | Capitalize the first letter of every space-separated word in a string. | String Formatting |
| [`LargestStr.java`](src/LargestStr.java) | Find the lexicographically largest string among an array of strings. | Lexicographical compare |
| [`RemoveDuplicatesInString.java`](src/RemoveDuplicatesInString.java) | Eliminate duplicate character occurrences from strings. | Set / Lookup Array |
| [`SubString.java`](src/SubString.java) | Extract substring starting at index $S$ and ending at $E$. | Substring Logic |
| [`FirstOccurrence.java`](src/FirstOccurrence.java) | Find the first index position of an element in an array. | Array Search |
| [`LastOccurrence.java`](src/LastOccurrence.java) | Find the last index position of an element in an array. | Array Search |
| [`PalindromeNum09.java`](src/PalindromeNum09.java) | Determine if an integer is a palindrome without converting to string. | LeetCode 9 |
| [`PrimeNumber.java`](src/PrimeNumber.java) | Basic checks for prime status and optimized algorithms. | Math |
| [`Glass.java`](src/Glass.java) | Calculate maximum hourglass pattern sums within a 2D grid. | HackerRank Hourglass |
| [`Time.java`](src/Time.java) | Measure and print runtime of executed code snippets. | Runtime Profiling |

---

## 🛠️ Compilation & Execution

Each implementation file has a standalone `public static void main(String[] args)` method containing test inputs and test cases.

### Using IntelliJ IDEA / Eclipse (Recommended)
1. Import this repository folder (**Alpha**) as a project.
2. Navigate to any file in `src/` (e.g., `src/LLUnderstand.java`).
3. Right-click and choose **Run 'LLUnderstand.main()'** to execute.

### Using Command Line (Terminal)
Navigate to the root directory and compile/run via the JDK compiler:
```bash
# 1. Compile a file (e.g., SudokuSolver.java)
javac src/SudokuSolver.java

# 2. Run the compiled class
java -cp src SudokuSolver
```

---

## ✨ Code Highlights

> [!TIP]
> **Key Optimization Patterns Used:**
> *   **Floyd's Cycle Detection:** Found in [`LLUnderstand.java`](src/LLUnderstand.java) and [`LLIsItCycle141.java`](src/LLIsItCycle141.java) using a fast pointer ($2\times$ speed) and a slow pointer ($1\times$ speed).
> *   **N-Queens Backtracking:** Found in [`BTNQueens.java`](src/BTNQueens.java), scanning possibilities recursively and backtracking whenever an attack state is hit.
> *   **Monotonic Stacks:** Employed in [`StackHistogramRectangle.java`](src/StackHistogramRectangle.java) to achieve $O(N)$ running time.
