/*
Name: Riya Chaudhary
Roll Number: 2510303439
Assignment Number: 14
Question Number: 2
*/

public class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
