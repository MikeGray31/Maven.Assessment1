package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        int counter = input.length();
        for(int i = 0; i < input.length(); i++){
            for(int j = i + 2;j <= input.length();j++){
                String check = input.substring(i, j);
                if(isPalindromic(check)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean isPalindromic(String input) {

        for(int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != (input.charAt(input.length()- i - 1))){
                return false;
            }
        }
        return true;
    }
}
