package edu.citytech.cst.finance.test.other;

import edu.citytech.cst.finance.service.IntegerBinarySearch;

import java.util.stream.IntStream;

public class T6_BinarySearch {

    public static void main(String[] args) {

        int data [] = IntStream.rangeClosed(1,1000)
                .map(e -> e * 5)
                .toArray();

        IntegerBinarySearch.binarySearch(10_000_000,data);



    }
}
