# Assignment 15: StringBuilder Operations

## 1. Experiment Title

StringBuilder Operations in Java.

## 2. Aim

To write Java programs using StringBuilder to append text, build a comma-separated sequence, and insert text at a specified position.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE / Text Editor: Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:


1. StringBuilder is a mutable sequence of characters in Java. Unlike String, its contents can be modified without creating a new string object for every change. append() adds text at the end, length() returns the number of characters, deleteCharAt() removes a character at a specified index, and insert() adds text at a specified position.


## 5. Algorithm / Procedure

### Question 1: Appending Text Using StringBuilder

1. Start the program.

2. Create a StringBuilder initialized with “Hello”.

3. Append “ World” to the existing text.

4. Display the updated text and its length.

5. Stop the program.



### Question 2: Creating a Comma-Separated Sequence

1. Start the program.

2. Create an empty StringBuilder.

3. Use a loop from 1 to 5 to append each number followed by a comma.

4. Delete the final comma using deleteCharAt().

5. Display the comma-separated sequence.

6. Stop the program.



### Question 3: Inserting Text Using StringBuilder

1. Start the program.

2. Create a StringBuilder initialized with “Java”.

3. Insert “Hello ” at index 0.

4. Display the updated text.

5. Stop the program.



## 6. Input

The following values are used in the experiment:


### Question 1:
Initial text = "Hello"; appended text = " World".


### Question 2:
Numbers from 1 to 5 are appended with commas.


### Question 3:
Initial text = "Java"; inserted text = "Hello " at index 0.


## 7. Output

### Question 1:
```text
Hello World
Length: 11
```


### Question 2:
```text
1,2,3,4,5
```


### Question 3:
```text
Hello Java
```


---

**Result:** All three Java programs were successfully written and executed to demonstrate mutable string operations using StringBuilder.
