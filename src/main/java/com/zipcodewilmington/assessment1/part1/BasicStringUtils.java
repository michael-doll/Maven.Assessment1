package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String upper = str.toUpperCase();
        return upper.charAt(0) + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder strSb = new StringBuilder(str);
        return strSb.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String strRev = reverse(str);
        return camelCase(strRev);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
       char [] strCharArr = str.toCharArray();
        for(int i = 0; i < strCharArr.length; i++){
            char current = strCharArr[i];
            if(Character.isUpperCase(current)){
                strCharArr[i] = Character.toLowerCase(current);
            }else{
                strCharArr[i] = Character.toUpperCase(current);
            }
        }
        return new String(strCharArr);
    }
}
