/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 13
Question Number: 4
*/

public class Main {
    public static void main(String[] args) {
        String word = "abc";

        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                System.out.println(word.substring(start, end));
            }
        }
    }
}
