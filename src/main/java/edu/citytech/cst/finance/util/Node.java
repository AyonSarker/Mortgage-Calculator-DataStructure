package edu.citytech.cst.finance.util;

class Node <T extends Comparable<T>>{

    T data;
    Node <T> next;

    Node(T data){
        this.data= data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
