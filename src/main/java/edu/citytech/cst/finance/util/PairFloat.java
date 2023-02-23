package edu.citytech.cst.finance.util;

public class PairFloat {

    private  float key;
    private  float value;

    public PairFloat(float key, float value){

        this.key = key;
        this.value = value;

    }

    public float getKey() {
        return key;
    }

    public float getValue() {
        return value;
    }

    public void setKey(float key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PairFloat{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
