/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 13
Question Number: 3
*/

public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
