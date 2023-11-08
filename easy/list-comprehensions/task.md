# List Comprehension

Link to challenge [HackerRank List Comprehension Challenge](https://www.hackerrank.com/challenges/list-comprehensions/problem?isFullScreen=true)
Let's learn about list comprehensions! You are given three integers x, y and z representing the dimensions of a cuboid along with an integer n. Print a list of all possible coordinates given by (i, j, k) on a 3D grid where the sum of i + j + k is not equal to n. Here, 0 <= i <= x; 0 <= j <= y; 0 < = k < = z. Please use **list comprehensions** rather than multiple loops, as a learning exercise.

Example:

x = 1

y = 1

z = 2

n = 3

All permutations of are:
[[0, 0, 0], [0, 0, 1], [0, 0, 2], [0, 1, 0 ], [1, 0, 0], [1, 0, 1], [1, 1, 0], [1, 1, 2]]

## **<u>Input Format</u>**

Four integers x, y, z and n, each on a separate line.

## **<u>Constraints</u>**

Print the list in lexicographic increasing order.

## **<u>Tests</u>**

### **<mark>Test 1</mark>**

_Input_:

`1
1
1
2`

_Output_:
`[[0, 0, 0], [0, 0, 1], [0, 1, 0], [1, 0, 0], [1, 1, 1]]`

### **<mark>Test 2</mark>**

_Input_:
`2
2
2
2`

_Output_:
`[[0, 0, 0], [0, 0, 1], [0, 1, 0], [0, 1, 2], [0, 2, 1], [0, 2, 2], [1, 0, 0], [1, 0, 2], [1, 1, 1], [1, 1, 2], [1, 2, 0], [1, 2, 1], [1, 2, 2], [2, 0, 1], [2, 0, 2], [2, 1, 0], [2, 1, 1], [2, 1, 2], [2, 2, 0], [2, 2, 1], [2, 2, 2]]`
