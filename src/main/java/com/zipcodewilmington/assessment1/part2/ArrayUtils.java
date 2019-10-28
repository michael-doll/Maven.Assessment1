package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        // re evaluate, try without two loops
        int count =0 ;
        for(int i =0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount) {
                for (int j = i; j < objectArray.length; j++){
                    if(objectArray[j] == objectToCount){
                        count++;
                    }
                }
                break;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList updatedList = new ArrayList<>();
        for(int i =0; i < objectArray.length;i++){
            if(!objectArray[i].equals(objectToRemove)) {
                updatedList.add(objectArray[i]);
            }
        }
        Integer[] returnArr = new Integer[updatedList.size()];
        for(int i =0; i < updatedList.size(); i++){
            returnArr[i] = (Integer)updatedList.get(i);
        }


        return returnArr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int bigGuy = 0;
        Object freq = objectArray[0];
        for (int i =0; i < objectArray.length; i++){
            int currentCount = getNumberOfOccurrences(objectArray,objectArray[i]);
           if(currentCount > bigGuy){
               bigGuy = currentCount;
               freq = objectArray[i];
           }
        }
        return freq;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int littleGuy = objectArray.length;
        Object freq = objectArray[0];
        for (int i =0; i < objectArray.length; i++){
            int currentCount = getNumberOfOccurrences(objectArray,objectArray[i]);
            if(currentCount < littleGuy){
                littleGuy = currentCount;
                freq = objectArray[i];
            }
        }
        return freq;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] combined = new Integer[objectArray.length + objectArrayToAdd.length];
        for(int i = 0; i < objectArray.length;i++) {
            combined[i] = (Integer)objectArray[i];
        }
        for(int i =combined.length-1; i >=objectArrayToAdd.length  ; i--){
            combined[i] = (Integer)objectArrayToAdd[i - objectArrayToAdd.length ];
        }

        return combined;
    }



}
