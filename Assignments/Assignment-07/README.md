# Assignment 7: Time Complexity and Loop Iterations

## 1. Experiment Title

Time Complexity and Loop Iterations in Java.

## 2. Aim

To write Java programs to count loop iterations for a single loop, nested loops, and a loop that repeatedly halves a number, demonstrating linear, quadratic, and logarithmic growth.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE / Text Editor: Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:


1. Time complexity describes how the number of operations grows with input size. O(n) represents linear growth, O(n²) represents quadratic growth, and O(log n) represents logarithmic growth. A single loop that runs n times is linear. Two nested loops that each run n times perform n × n iterations. Repeatedly dividing a value by 2 produces logarithmic iteration growth.


## 5. Algorithm / Procedure

### Question 1: Counting Steps in a Single Loop

1. Start the program.

2. Initialize steps with 0.

3. Run a for loop from 1 to 10.

4. Increment steps during each iteration.

5. Display the total number of steps.

6. Stop the program.



### Question 2: Counting Steps in Nested Loops

1. Start the program.

2. Initialize steps with 0.

3. Use two nested for loops, each running from 1 to 10.

4. Increment steps in the inner loop.

5. Display the total number of steps.

6. Stop the program.



### Question 3: Counting Halving Steps

1. Start the program.

2. Initialize n with 1024 and count with 0.

3. While n is greater than 1, divide n by 2 and increment count.

4. Display the number of halving steps.

5. Stop the program.



## 6. Input

The following values are used in the experiment:


### Question 1:
Loop limit = 10.


### Question 2:
Both loop limits = 10.


### Question 3:
n = 1024.


## 7. Output

### Question 1:
```text
Steps: 10
```


### Question 2:
```text
Steps: 100
```


### Question 3:
```text
Halving steps: 10
```


---

**Result:** All three Java programs were successfully written and executed to demonstrate linear, quadratic, and logarithmic loop iteration patterns.
