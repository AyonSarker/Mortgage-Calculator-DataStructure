package edu.citytech.cst.finance.test.util;

import edu.citytech.cst.finance.util.IntDynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Dynamic Array Test")
public class T1_DynamicArray {


    @DisplayName("check the size of the array")
    @ParameterizedTest
    @CsvSource({"2","3","4","5","100","0"})
    public void t1(int size) {
        IntDynamicArray da = new IntDynamicArray(size);
        da.insert(50);
        da.insert(60);
        da.insert(70);


        int expected = 3;
        int actual = da.size();
        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("insert data with var arg")
    public void e3() {
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected = 10;
        int actual = da.size();
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("delete last item")
    public void e4() {
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeLastItem();
        int expected = 9;
        int actual = da.size();
        System.out.println(da);
        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("removeAll items in the IntDynamicArray")
    public void e5() {
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeAll();
        int expected = 0;
        int actual = da.size();
        System.out.println(da);
        assertEquals(expected,actual);

        da.insert(4);
        System.out.println(da);
        System.out.println("sarker");


    }

    @Test
    @DisplayName("get method")
    public void e6() {
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected = 100;
        int actual = da.get(2);
        System.out.println(da);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("getLastItem")
    public void e7() {
        IntDynamicArray da = new IntDynamicArray(5);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected = 77;
        int actual = da.getLastItem();
        System.out.println(da);
        assertEquals(expected,actual);
    }


    @Test void printName(){
        System.out.println("Ayon, Sarker");
    }
}
