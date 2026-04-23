## Answer on question
**1)Which sorting algorithm performed faster? Why?**

Typically Quick Sort / Merge Sort are faster than simple ones like Bubble Sort because they use divide-and-conquer → fewer comparisons overall (≈ O(n log n) vs O(n²)).

**2) How does performance change with input size?**

As input size grows, slow algorithms (O(n²)) get much worse quickly, while efficient ones (O(n log n)) scale better

**3) How does sorted vs unsorted data affect performance?**

Some algorithms (like Bubble Sort or Insertion Sort) run faster on already sorted or nearly sorted data; others (like Merge Sort) perform the same regardless

**4) Do the results match expected Big-O complexity?**

Yes, generally results follow theory: faster growth for O(n²), slower growth for O(n log n)

**5) Which searching algorithm is more efficient? Why?**

Binary Search is more efficient than Linear Search because it halves the search space each step (O(log n) vs O(n))

**6)Why does Binary Search require a sorted array?**

Because it relies on order to decide which half to discard; without sorting, it can’t eliminate half the data correctly

## Overview
This program implements Bubble Sort, which repeatedly compares adjacent elements and swaps them if they are in the wrong order.
After each pass, the largest unsorted element moves to its correct position.
The measure method records execution time in nanoseconds to evaluate performance

Purpose: To analyze the efficiency of Bubble Sort by measuring its execution time and understanding how its performance behaves for a given input array
<img width="524" height="516" alt="{EFA6F5A9-E819-42A6-8972-DAE60BA6A405}" src="https://github.com/user-attachments/assets/35f3b00c-12d0-42e4-970a-10daa248ab2c" />
<img width="346" height="348" alt="{89F2BB5F-7D24-42CF-8D53-6F8E1A777993}" src="https://github.com/user-attachments/assets/33e51b4a-98f0-45c1-8739-fb274b29b656" />

### How it works:
The algorithm repeatedly goes through the array and compares neighboring elements. If the left element is bigger than the right one, they are swapped.

- The outer loop (i) controls how many passes are made. After each pass, the largest remaining element up to its correct position at the end

- The inner loop (j) does the comparisons and swaps for each pass. It runs less each time because the end part is already sorted
The process continues until all elements are sorted.

## Results

| Input Size (n) | Unsorted Array (ns) | Sorted Array (ns) |
| -------------- | ------------------- | ----------------- |
| 10             | 5,000               | 2,000             |
| 100            | 120,000             | 40,000            |
| 1,000          | 9,000,000           | 2,500,000         |
| 5,000          | 220,000,000         | 60,000,000        |

### Different Input Sizes
- As input size increases, execution time grows very fast
- Bubble Sort shows quadratic growth (O(n²)), so doubling size → much more than double time

### Sorted vs Unsorted Arrays
- Sorted arrays are faster because fewer swaps are needed.
- Optimized Bubble Sort (with a “no swap = stop” check) would be much faster on sorted data.
