package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    
    public Integer countPalindromes(String input){
        Integer count = 0;
        StringBuilder sb = new StringBuilder(input);

        for(int i =0; i < input.length() ; i++) {
            for(int j =i+1; j <=input.length(); j++) {
                String current = input.substring(i,j);
                if (isPalindrome(current)) {
                    count++;
                }
            }
        }
        return count ;
    }
    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return (word.equals(sb.reverse().toString()));
    }
}
