# Assignment 6: Array Traversal, Minimum Element and Duplicate Detection

## 1. Experiment Title

Array Traversal, Minimum Element and Duplicate Detection in Java.

## 2. Aim

To write Java programs to traverse an array in reverse order, find the smallest element and its index, and detect a repeated value in an array.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE / Text Editor: Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:


1. Array traversal means accessing array elements one by one. Array indexes start at 0 and the last index is length - 1. Reverse traversal starts from the last index and moves toward 0. A minimum-value search compares each element with the current smallest value and stores its index. Nested loops can compare pairs of elements to detect duplicates.


## 5. Algorithm / Procedure

### Question 1: Reverse Array Traversal

1. Start the program.

2. Initialize the array with 10, 20, 30, 40, and 50.

3. Start a loop from the last index and decrement the index in each iteration.

4. Display each element in reverse order.

5. Stop the program.



### Question 2: Smallest Element and Its Index

1. Start the program.

2. Initialize the array with 2, 5, 1, 8, 3, and 4.

3. Set the first element as the smallest value and its index as 0.

4. Compare each remaining element with the current smallest value.

5. Update the smallest value and index when a smaller element is found.

6. Display the smallest value and its index.

7. Stop the program.



### Question 3: Finding a Repeated Value

1. Start the program.

2. Initialize the array with 4, 9, 2, 9, and 7.

3. Use nested loops to compare each element with the elements after it.

4. When a matching pair is found, store the repeated value and stop further searching.

5. Display the repeated value, or display that no repeated value exists.

6. Stop the program.



## 6. Input

The following values are used in the experiment:


### Question 1:
Array = {10, 20, 30, 40, 50}.


### Question 2:
Array = {2, 5, 1, 8, 3, 4}.


### Question 3:
Array = {4, 9, 2, 9, 7}.


## 7. Output

### Question 1:
```text
50
40
30
20
10
```


### Question 2:
```text
Smallest: 1 at index 2
```


### Question 3:
```text
Repeated value: 9
```


---

**Result:** All three Java programs were successfully written and executed to demonstrate reverse array traversal, minimum-element searching, and duplicate detection.
