package com.rocxoft;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for(int s=-1;s<50;++s) {
            getPaths(s);
        }
       }

    public static int getPaths(int nSteps) {
        Staircase stairs = new Staircase();
        int nPaths = stairs.getPaths(nSteps);
        System.out.format("%d combinations for a stair with %d steps\n", nPaths, nSteps);
        return nPaths;
    }
}
