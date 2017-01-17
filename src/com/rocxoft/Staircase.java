package com.rocxoft;

import java.util.Dictionary;
import java.util.ArrayList;

/**
 * Created by jan on 1/14/2017.
 */
public class Staircase {
    //Dictionary<Integer,Integer> memoi;
    static ArrayList<Integer> memoi = null;


    public Staircase() {
        // memoi = new     Dictionary<Integer,Integer>();
        if (memoi == null) {
            memoi = new ArrayList(20);
            memoi.add(0, 0);
            memoi.add(1, 1);
            memoi.add(2, 2);
            memoi.add(3, 4);
        }
    }
    public Integer getPaths(int nSteps) {
        if (nSteps < 0)
            return 0;
        if (nSteps<memoi.size())
            return memoi.get(nSteps);
        Integer nPaths = getPaths(nSteps - 1);
        nPaths += getPaths(nSteps - 2);
        nPaths += getPaths(nSteps - 3);
        memoi.add(nSteps,nPaths);
        return nPaths;
    }
}

