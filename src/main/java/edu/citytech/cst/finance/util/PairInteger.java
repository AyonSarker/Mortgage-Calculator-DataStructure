package edu.citytech.cst.finance.util;

public class PairInteger {

    private  int key;
    private  int value;

    public PairInteger(Integer key, Integer value){

        this.key = key;
        this.value = value;

    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PairInteger{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
