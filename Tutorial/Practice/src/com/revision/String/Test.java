package com.revision.String;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = "Indi@ !s a gre@t country";
        
        // Split the string into an array of characters
        String[] s1 = s.split("");
        String s2 = "";
        
        // Iterate through the array of characters
        for (int i = 0; i < s1.length; i++) {
            // Check if the character is not '@' or '!'
            if (!s1[i].equals("@") && !s1[i].equals("!")) {
                s2 += s1[i];
            }
        }
        
        // Print the result
        System.out.println(s2);
    }
}
