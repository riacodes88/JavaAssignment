/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 9
Question Number: 2
*/

public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += m[row][col];
            }
            System.out.println("Column " + (col + 1) + " sum: " + sum);
        }
    }
}
