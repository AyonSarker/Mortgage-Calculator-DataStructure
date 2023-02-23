package edu.citytech.cst.finance.test.util;

import com.jbbwebsolutions.ds.facade.IList;
import edu.citytech.cst.finance.util.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SingleLinkedList.removeFirstItem By Ayon Sarker")
public class T9_SingleLinkListRemoveFirst {

    @DisplayName("removeFirstItem from A")
    @Test
    public void t0(){
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A");
        da.removeFirstItem();
        int expected = 0;
        int actual = da.size();
        var results = da.toString();
        System.out.println(results);
        assertEquals(expected,actual);

    }

    @DisplayName("removeFirstItem from A,B")
    @Test
    public void t1(){
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B");
        da.removeFirstItem();
        int expected = 1;
        int actual = da.size();
        var results = da.toString();
        System.out.println(results);
        assertEquals(expected,actual);

    }

    @DisplayName("removeFirstItem from A B C")
    @Test
    public void t2(){
        IList<String> da = new SingleLinkedList<>(String[]::new);
        da.inserts("A","B","C");
        da.removeFirstItem();
        int expected = 2;
        int actual = da.size();
        var results = da.toString();
        System.out.println(results);
        assertEquals(expected,actual);

    }
}
