/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 7
Question Number: 2
*/

public class Main {
    public static void main(String[] args) {
        int steps = 0;
        // Time complexity: O(n^2), because both loops run 10 times.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
