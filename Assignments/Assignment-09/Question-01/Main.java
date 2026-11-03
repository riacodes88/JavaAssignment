/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 9
Question Number: 1
*/

public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int value : m[0]) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Last row: ");
        for (int value : m[2]) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
