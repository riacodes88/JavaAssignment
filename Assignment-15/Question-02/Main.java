/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 15
Question Number: 2
*/

public class Main {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(",");
        }

        numbers.deleteCharAt(numbers.length() - 1);
        System.out.println(numbers);
    }
}
