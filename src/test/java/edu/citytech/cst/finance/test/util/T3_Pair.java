package edu.citytech.cst.finance.test.util;

import edu.citytech.cst.finance.util.*;

public class T3_Pair {

    public static void main(String[] args) {

        Pair pairFloat = new Pair<Float,Float>(10f,20f);
        System.out.println(pairFloat);

        Pair pairString = new Pair<String,String>("33232","Sarker");
        System.out.println(pairString);

        Pair pairInteger = new Pair<Integer,Integer>(100,200);
        System.out.println(pairInteger);

        Pair pairDouble = new Pair<Double,Double>(100d,200d);
        System.out.println(pairDouble);

        Pair p =  new Pair<String,Float>("Sarker",70_000f);
        System.out.println(p);

    }


}
