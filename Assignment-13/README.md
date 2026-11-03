# Assignment 13: String Operations

## 1. Experiment Title

String Operations in Java.

## 2. Aim

To write Java programs to find string length, locate a character, convert a string to uppercase, reverse a string, check a palindrome, and display all substrings.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE / Text Editor: Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:


1. String is a sequence of characters in Java. The length() method returns the number of characters, indexOf() returns the first index of a character, and toUpperCase() converts letters to uppercase. charAt() accesses a character at a specified index. A string can be reversed by traversing it from the last index to the first. A palindrome reads the same forward and backward. substring() extracts a portion of a string.


## 5. Algorithm / Procedure

### Question 1: String Length, Character Position and Uppercase

1. Start the program.

2. Initialize word with “Programming”.

3. Display its length.

4. Find and display the first position of character 'g'.

5. Convert the word to uppercase and display it.

6. Stop the program.



### Question 2: Reversing a String

1. Start the program.

2. Initialize word with “Java” and reversed with an empty string.

3. Traverse the word from the last index to the first.

4. Append each character to reversed.

5. Display the reversed string.

6. Stop the program.



### Question 3: Palindrome Check

1. Start the program.

2. Initialize word with “racecar” and reversed with an empty string.

3. Build the reversed string by traversing the original string backward.

4. Compare the original and reversed strings using equals().

5. Display whether the word is a palindrome.

6. Stop the program.



### Question 4: Displaying All Substrings

1. Start the program.

2. Initialize word with “abc”.

3. Use nested loops to select each valid starting and ending index.

4. Display each substring using substring().

5. Stop the program.



## 6. Input

The following values are used in the experiment:


### Question 1:
word = "Programming".


### Question 2:
word = "Java".


### Question 3:
word = "racecar".


### Question 4:
word = "abc".


## 7. Output

### Question 1:
```text
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```


### Question 2:
```text
Reversed: avaJ
```


### Question 3:
```text
racecar is a palindrome
```


### Question 4:
```text
a
ab
abc
b
bc
c
```


---

**Result:** All four Java programs were successfully written and executed to demonstrate common string operations, reversal, palindrome checking, and substring generation.
