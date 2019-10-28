package com.zipcodewilmington.assessment1.part4;

//DNF
public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps = 0;
        if (k % j == 0) {
            jumps = k / j;
        } else {
            jumps = (k / j) + 1;
        }
        return jumps;
    }
}
