/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 7
Question Number: 3
*/

public class Main {
    public static void main(String[] args) {
        int n = 1024;
        int count = 0;
        // Time complexity: O(log n), because n is halved each iteration.
        while (n > 1) {
            n /= 2;
            count++;
        }
        System.out.println("Halving steps: " + count);
    }
}
