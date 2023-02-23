package edu.citytech.cst.finance.util;

public class PairDouble {

    private  double key;
    private  double value;

    public PairDouble(double key, double value){

        this.key = key;
        this.value = value;

    }

    public double getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }

    public void setKey(double key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PairDouble{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
