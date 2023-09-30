package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("dog"));
    }

    //public means it can be accessed by other class
    //static means this method can be called without creating an instance of the (Main) class
    public static String reverse(String s) {
        //initializing two arrays: one to store the original string as character array, one empty character array to hold reversed original string
        //initializing variable to represent first element of reversed array
        char[] reversed = new char[s.length()];
        char[] originalString = s.toCharArray();
        int p = 0;
        //loop to iterate through original array backwards, the last element of originalString will be assigned to first element of reversed
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed[p] = originalString[i];
            p++;
        }
        //This method must return a string so creating new string with value of the reversed character array
        String str = new String(reversed);
        return str;
    }
}
