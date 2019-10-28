package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
//        int counter = input.length();
//        for(int i = 0; i < input.length()/2; i++){
//            for(int j = i + 2;j <= input.length();j++){
//                String check = input.substring(i, j);
//                String check2 = input.substring(input.length() - j, input.length() - i);
//                if(check.equals(BasicStringUtils.reverse(check))){
//                    counter++;
//                }
//                if(check2.equals(BasicStringUtils.reverse(check)) /*&& input.length() - j != i*/){
//                    counter++;
//                }
//            }
//        }
        int counter = input.length();
        for(int i = 0; i < input.length(); i++){
            for(int j = i + 2;j <= input.length();j++){
                String check = input.substring(i, j);
                if(check.equals(BasicStringUtils.reverse(check))){
                    counter++;
                }
            }
        }
        return counter;
    }


}
