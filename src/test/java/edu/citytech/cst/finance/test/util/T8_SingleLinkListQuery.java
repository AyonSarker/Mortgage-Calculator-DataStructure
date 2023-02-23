package edu.citytech.cst.finance.test.util;


import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.cst.finance.util.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("SingleLinkedList.query")
public class T8_SingleLinkListQuery {

    @DisplayName("Check the size of the SingleLinkedList")
    @Test

    public void t0(){
        IList<String> da = new SingleLinkedList<>(String[]::new);

        da.insert("A");
        var results= da.query(e -> e.equals("A"));
        int expected = 1;
        int actual = results.length;
        assertEquals(expected,actual);
    }

    @DisplayName("Check the size of the SingleLinkedList (2)")
    @Test

    public void t1(){
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B","C","D");
        var results= da.query(e -> e.equals("A") || e.equals("D"));
        int expected = 2;
        int actual = results.length;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("get the last item ")


    public void t2(){
        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x = 1; x<= 100; x++)
            da.insert(x);
        var results = da.query(e -> e < 51);
        var expected = 50;
        var actual = results.length;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("check for D using Query method")


    public void t3(){
        IList<String> da = new SingleLinkedList<>(String[]::new);

        da.inserts("D","A","B","C","D");
        var firstItem= da.query(e-> e.equals("D"));
        var actual = firstItem.length==2 && firstItem[0].getValue().equals("D")
                && firstItem[1].getValue().equals("D");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Query with the limit parameter limit 3 ")


    public void t4(){
        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x = 1; x<= 100; x++)
            da.insert(x);
        var results = da.query(e -> e < 51,3);
        var expected = 3;
        var actual = results.length;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Query with the limit parameter limit 10 ")


    public void t5(){
        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x = 1; x<= 100; x++)
            da.insert(x);
        var results = da.query(e -> e < 51,10);
        var expected = 10;
        var actual = results.length;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Query with the limit parameter limit 25 ")


    public void t6(){
        IList<Integer> da = new SingleLinkedList<>(Integer[]::new);
        for(int x = 1; x<= 100; x++)
            da.insert(x);
        var results = da.query(e -> e < 51,25);
        var expected = 25;
        var actual = results.length;
        assertEquals(expected,actual);
    }



}
