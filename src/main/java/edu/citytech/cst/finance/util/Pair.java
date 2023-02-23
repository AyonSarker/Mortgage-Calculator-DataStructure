package edu.citytech.cst.finance.util;

public class Pair <K,V>{

    private  K key;
    private  V value;

    public Pair(K key, V value){

        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
