package edu.citytech.cst.finance.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.cst.finance.util.DynamicArray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Dynamic Array coding with interface")
public class T6_DynamicArrayWithInterfaces {


    @DisplayName("check the size of the array")
    @Test
    public void t1() {
        IList<Integer> da = new DynamicArray<>(Integer[]::new);

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
        IList<Integer> da = new DynamicArray(Integer[]::new);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected = 10;
        int actual = da.size();
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("delete last item")
    public void e4() {
        IList<Integer> da = new DynamicArray(Integer[]::new);
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
        IList<Integer> da = new DynamicArray(Integer[]::new);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        da.removeAll();
        int expected = 0;
        int actual = da.size();
        System.out.println(da);
        assertEquals(expected,actual);




    }

    @Test
    @DisplayName("get method")
    public void e6() {
        IList<Integer> da = new DynamicArray(Integer[]::new);
        da.inserts(44,33,100,99,72,75,111,55,66,77);
        int expected = 100;
        int actual = da.get(2);
        System.out.println(da);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("getLastItem")
    public void e7() {
        IList<Integer> da = new DynamicArray(Integer[]::new);
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
