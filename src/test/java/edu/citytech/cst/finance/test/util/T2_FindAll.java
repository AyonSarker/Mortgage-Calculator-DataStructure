package edu.citytech.cst.finance.test.util;

import edu.citytech.cst.finance.util.IntDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find the index by value ")
public class T2_FindAll {

    @Test
    @DisplayName("Find value 100")
    public void e3() {
        IntDynamicArray da = new IntDynamicArray(12);
        da.inserts(44,33,100,99,72,75,111,55,66,77,100);
        int searchValue =100;
        int[] positionFound = da.findAll(searchValue);
        int expected = 2;
        int actual = positionFound.length;
        assertEquals(expected,actual);

        System.out.println(da);

    }

    @DisplayName("Search for values")
    @ParameterizedTest
    @CsvSource({ "2,0"
                 ,"100,2"
                 ,"99,1"
                 , "77,1"})
    public void e4(int searchValue, int expected) {
        IntDynamicArray da = new IntDynamicArray(12);
        da.inserts(44,33,100,99,72,75,111,55,66,77,100);
        int actual =da.findAll(searchValue).length ;
        assertEquals(expected,actual);




    }

    @Test void printName(){
        System.out.println("Sarker, Ayon");
    }
}
