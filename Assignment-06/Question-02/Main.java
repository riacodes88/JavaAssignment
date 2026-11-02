/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 6
Question Number: 2
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }

        System.out.println("Smallest: " + smallest + " at index " + smallestIndex);
    }
}
