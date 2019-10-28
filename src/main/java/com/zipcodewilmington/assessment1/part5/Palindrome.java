package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    // figure out what this wants
    public Integer countPalindromes(String input){
        Integer count = 0;
        if(isPalindrome(input)){
                count++;
        }
        return count ;
    }
    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return (word.equals(sb.reverse().toString()));
    }
}
