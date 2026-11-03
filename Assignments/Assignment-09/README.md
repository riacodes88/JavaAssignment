# Assignment 9: Matrix Row and Column Operations

## 1. Experiment Title

Matrix Row and Column Operations in Java.

## 2. Aim

To write Java programs to display the first and last rows of a matrix, calculate the sum of each column, and count matrix values greater than 5.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE / Text Editor: Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:


1. A matrix is represented using a two-dimensional array. The first row has index 0, and the last row has index rows - 1. A row can be traversed directly, while a column is accessed by keeping the column index fixed and changing the row index. Nested enhanced for loops can visit every element in a matrix.


## 5. Algorithm / Procedure

### Question 1: Displaying First and Last Rows

1. Start the program.

2. Initialize a 3 × 3 matrix with values 1 through 9.

3. Display the first row by traversing matrix row 0.

4. Display the last row by traversing matrix row 2.

5. Stop the program.



### Question 2: Sum of Each Column

1. Start the program.

2. Initialize a 3 × 3 matrix with values 1 through 9.

3. For each column, initialize sum to 0.

4. Traverse all rows for that column and add the values.

5. Display the sum of each column.

6. Stop the program.



### Question 3: Counting Values Greater Than 5

1. Start the program.

2. Initialize a 3 × 3 matrix with values 1 through 9.

3. Initialize count with 0.

4. Traverse every row and element of the matrix.

5. Increment count for each value greater than 5.

6. Display the count.

7. Stop the program.



## 6. Input

The following values are used in the experiment:


### Question 1:
Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}.


### Question 2:
Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}.


### Question 3:
Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; comparison value = 5.


## 7. Output

### Question 1:
```text
First row: 1 2 3 
Last row: 7 8 9 
```


### Question 2:
```text
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```


### Question 3:
```text
Values greater than 5: 4
```


---

**Result:** All three Java programs were successfully written and executed to demonstrate matrix row traversal, column-wise sum calculation, and conditional counting.
