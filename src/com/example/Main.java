package com.example;

public class Main {
    //alternative method of reversing strings I found in a youtube video https://www.youtube.com/watch?v=orUTq3CahRE&list=PL59LTecnGM1MMSBPiLN4aMwM7DcnVld0s&index=1
    public static void main(String[] args) {
        String r = reverse("dog");
        System.out.println(r);
    }

    //public means it can be accessed by other class
    //static means this method can be called without creating an instance of the (Main) class
    public static String reverse(String s) {
        //initializing letters array to store the letters of original string as character array
        //initializing variable to represent first element of reversed array
        char[] letters = new char[s.length()];
        int letterIndex = 0;

        //iterating backwards through original array to get last character first,
        //then assigning that last character of ogarray to the first letter of letters array
        for(int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        //initializing empty string, then appending each character of our letters array which has the reverse string
        //so that we can return a string
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
